package com.huawei.digitalpayment.consumer.remoteconfig.service;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.firebase.messaging.RemoteMessage;
import com.huawei.digitalpayment.consumer.remoteconfig.RemoteConfig;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import javax.inject.Inject;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.notify;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/remoteconfig/service/FirebaseNotificationService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "remoteConfig", "Lcom/huawei/digitalpayment/consumer/remoteconfig/RemoteConfig;", "getRemoteConfig", "()Lcom/huawei/digitalpayment/consumer/remoteconfig/RemoteConfig;", "setRemoteConfig", "(Lcom/huawei/digitalpayment/consumer/remoteconfig/RemoteConfig;)V", "onMessageReceived", "", "message", "Lcom/google/firebase/messaging/RemoteMessage;", "ConsumerSfcRemoteConfig_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class FirebaseNotificationService extends Hilt_FirebaseNotificationService {

    @Inject
    public RemoteConfig remoteConfig;
    private static final byte[] $$u = {5, SignedBytes.MAX_POWER_OF_TWO, 127, 81};
    private static final int $$x = 19;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$s = {69, 81, 99, -123, Ascii.DLE, 2, 7, 3, 3, -5, 13, 10, -61, 8, 9, -4, 1, 9, Ascii.SO, -70, 57, Ascii.DLE, 7, 1, 10, 3, -7, 9, -5, Ascii.DC2, -65, 58, 5, 1, Ascii.ETB, -10, -53, 63, 9, 10, -11, 17, 0, -9, Ascii.SI, -58, Ascii.SUB, 37, 1, Ascii.ETB, -10, -32, TarHeader.LF_NORMAL, 7, 1, 10, 3, -7, 9, -5, -24, 41, -4, 13, -34, 40, 7, 0, PSSSigner.TRAILER_IMPLICIT, TarHeader.LF_CHR, Ascii.EM, -3, Ascii.NAK, -9, -29, 33, Ascii.ETB, -15, -8, -8, Ascii.SO, 37, -15, Ascii.ETB, -11, Ascii.DLE, 2, 7, 3, 3, -5, 13, 10, -62, Ascii.DLE, 2, -59, TarHeader.LF_CONTIG, Ascii.SI, 1, -3, 3, 5, 3, -47, Base64.padSymbol, Ascii.SI, -5, 17, -13, 17, -64, 66, 7, 9, 4, -7, 0, -51, 69, 0, 2, 10, -61, Ascii.GS, TarHeader.LF_CONTIG, -13, Ascii.VT, -25, Ascii.SUB, 9, 1, Ascii.EM, -3, Ascii.NAK, -9, -29, 33, Ascii.ETB, -15, -8, -8, Ascii.SO, 37, -15, Ascii.ETB, -11, 0, -58, 58, Ascii.DC2, 1, -2, -1, 19, 0, 3, 8, 1, -2, -1, 19, -65, Base64.padSymbol, 6, 1, -52, Ascii.GS, 38, 1, -30, TarHeader.LF_SYMLINK, -13, Ascii.SUB, -18, 5, Ascii.SO, -3, -24, 41, -1, Ascii.SI};
    private static final int $$t = 201;
    private static final byte[] $$g = {TarHeader.LF_NORMAL, -22, 122, 126, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, Ascii.FF, -12, 19, Ascii.SI, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$h = 39;
    private static int copydefault = 0;
    private static int equals = 1;
    private static long component2 = 7491082995910923580L;
    private static long component3 = -1352978518146817232L;
    private static int ShareDataUIState = 1386857713;
    private static char component1 = 50417;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$y(short r6, byte r7, short r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.remoteconfig.service.FirebaseNotificationService.$$u
            int r8 = r8 * 2
            int r8 = 1 - r8
            int r7 = r7 * 2
            int r7 = r7 + 4
            int r6 = r6 + 98
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r6 = r8
            r4 = r2
            goto L25
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r3 = r0[r7]
        L25:
            int r7 = r7 + 1
            int r6 = r6 + r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.remoteconfig.service.FirebaseNotificationService.$$y(short, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void l(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r0 = 28 - r8
            byte[] r1 = com.huawei.digitalpayment.consumer.remoteconfig.service.FirebaseNotificationService.$$g
            int r7 = r7 + 4
            int r6 = r6 * 2
            int r6 = 103 - r6
            byte[] r0 = new byte[r0]
            int r8 = 27 - r8
            r2 = 0
            if (r1 != 0) goto L15
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2d
        L15:
            r3 = r2
        L16:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2d:
            int r7 = r7 + 1
            int r6 = r6 + r4
            int r6 = r6 + (-8)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.remoteconfig.service.FirebaseNotificationService.l(int, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = 73 - r8
            byte[] r0 = com.huawei.digitalpayment.consumer.remoteconfig.service.FirebaseNotificationService.$$s
            int r7 = r7 + 4
            int r6 = r6 + 83
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r7
            r4 = r2
            goto L2c
        L10:
            r3 = r2
        L11:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            int r6 = r6 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r3 = r3 + r6
            int r6 = r3 + (-4)
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.remoteconfig.service.FirebaseNotificationService.m(byte, int, short, java.lang.Object[]):void");
    }

    public final RemoteConfig getRemoteConfig() {
        int i = 2 % 2;
        int i2 = equals + 121;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        RemoteConfig remoteConfig = this.remoteConfig;
        if (remoteConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i3 + 107;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return remoteConfig;
    }

    public final void setRemoteConfig(RemoteConfig remoteConfig) {
        int i = 2 % 2;
        int i2 = equals + 103;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(remoteConfig, "");
        this.remoteConfig = remoteConfig;
        int i4 = equals + 5;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void onMessageReceived(RemoteMessage message) {
        RemoteConfig remoteConfig;
        boolean z;
        int i = 2 % 2;
        int i2 = equals + 9;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(message, "");
            super.onMessageReceived(message);
            message.getData().containsKey("CONFIG_STATE");
            throw null;
        }
        Intrinsics.checkNotNullParameter(message, "");
        super.onMessageReceived(message);
        if (message.getData().containsKey("CONFIG_STATE")) {
            int i3 = equals + 83;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                remoteConfig = getRemoteConfig();
                z = false;
            } else {
                remoteConfig = getRemoteConfig();
                z = true;
            }
            remoteConfig.setRemoteConfigStale(z);
            getRemoteConfig().check();
        }
    }

    private static void j(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i3 = notifyVar.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                if (objCopydefault == null) {
                    int gidForName = Process.getGidForName("") + 3267;
                    int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 33;
                    char cMyPid = (char) ((Process.myPid() >> 22) + 60268);
                    byte length2 = (byte) $$u.length;
                    byte b2 = (byte) (length2 - 4);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(gidForName, doubleTapTimeout, cMyPid, -834797019, false, $$y(length2, b2, b2), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() ^ (component2 ^ 5431355972723572778L);
                Object[] objArr3 = {notifyVar, notifyVar};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault2 == null) {
                    byte b3 = (byte) 0;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(View.resolveSizeAndState(0, 0, 0) + 687, (ViewConfiguration.getTouchSlop() >> 8) + 34, (char) (ImageFormat.getBitsPerPixel(0) + 60374), -1969106284, false, $$y((byte) 7, b3, b3), new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i4 = $10 + 25;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            Object[] objArr4 = {notifyVar, notifyVar};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
            if (objCopydefault3 == null) {
                byte b4 = (byte) 0;
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(688 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (Process.myTid() >> 22) + 34, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 60372), -1969106284, false, $$y((byte) 7, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            int i6 = $11 + 65;
            $10 = i6 % 128;
            int i7 = i6 % 2;
        }
        objArr[0] = new String(cArr2);
    }

    private static void k(int i, char[] cArr, char[] cArr2, char[] cArr3, char c2, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        int i4 = 0;
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        while (iNotificationSideChannel.copydefault < length3) {
            int i5 = $11 + 65;
            $10 = i5 % 128;
            int i6 = i5 % i2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    int iRgb = (-16773179) - Color.rgb(i4, i4, i4);
                    int maximumFlingVelocity = 31 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    char maxKeyCode = (char) (19181 - (KeyEvent.getMaxKeyCode() >> 16));
                    byte b2 = (byte) ($$x & 5);
                    byte b3 = (byte) (b2 - 1);
                    String str$$y = $$y(b2, b3, b3);
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iRgb, maximumFlingVelocity, maxKeyCode, 1912513118, false, str$$y, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 7568;
                    int iIndexOf = TextUtils.indexOf("", "") + 11;
                    char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i4] = Object.class;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(modifierMetaStateMask, iIndexOf, scrollBarFadeDuration, 2006389106, false, "e", clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                int i7 = cArr4[iNotificationSideChannel.copydefault % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i7);
                objArr4[i4] = iNotificationSideChannel;
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) i4;
                    byte b5 = b4;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(AndroidCharacter.getMirror('0') + 2411, KeyEvent.keyCodeFromString("") + 28, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 931716605, false, $$y(b4, b5, b5), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7566 - TextUtils.indexOf((CharSequence) "", '0'), (ViewConfiguration.getFadingEdgeLength() >> 16) + 11, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (component3 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) ShareDataUIState) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) component1) ^ (-3780477796495014671L)))));
                iNotificationSideChannel.copydefault++;
                int i8 = $11 + 51;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 5 % 2;
                    i2 = 2;
                } else {
                    i2 = 2;
                }
                i4 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(50:0|2|(2:(2:9|(1:15)(1:14))(1:16)|(9:18|861|19|(1:21)|22|23|24|(1:26)|27)(1:7))(0)|31|911|32|(2:835|34)|38|39|(5:882|(5:41|42|(1:44)|45|46)(24:47|48|907|49|50|895|51|(2:899|53)|57|58|886|59|(2:819|61)|65|66|67|(3:69|890|70)|74|75|76|(1:78)|79|(1:81)|82)|83|(4:86|(3:921|88|924)(12:920|89|(3:91|(3:94|95|92)|925)|96|875|97|(1:99)|100|101|862|102|923)|922|84)|919)|145|874|146|(1:148)|149|(3:151|(1:153)|154)(14:156|157|859|158|(1:160)|161|162|163|(1:165)|166|(1:168)|169|(1:171)|172)|155|173|(9:176|853|177|(1:179)|180|181|182|845|183)|184|(3:885|215|(1:221)(1:220))(1:225)|226|849|227|(1:229)|230|839|231|(1:233)|234|258|847|259|(14:813|261|265|(6:267|913|268|269|832|270)(1:275)|843|276|277|812|(4:279|280|(1:282)|283)(12:(2:285|(1:291)(1:290))(1:295)|(21:297|833|298|(2:864|300)|304|305|825|306|(2:915|308)|312|313|314|(2:316|317)|318|319|817|320|(2:917|322)(1:324)|325|(1:327)|328)(2:382|383)|388|389|870|390|393|394|(1:396)(1:397)|398|399|400)|329|(5:332|333|(2:335|928)(12:336|(3:338|(3:341|342|339)|929)|345|909|346|(1:348)|349|350|897|351|352|927)|353|330)|926|367|383)(12:265|(0)(0)|843|276|277|812|(0)(0)|329|(1:330)|926|367|383)|401|879|402|(1:404)|405|(3:407|(1:409)|410)(19:411|412|868|413|(1:415)|416|417|857|418|(1:420)|421|422|423|(1:425)|426|(1:428)(1:429)|430|(1:432)|433)|434|(4:437|(2:439|932)(11:440|(3:442|(3:445|446|443)|933)|447|851|448|(1:450)|451|452|841|453|931)|454|435)|930|488|(1:490)|491|(3:493|(1:495)|496)(14:497|498|(1:500)|501|502|(1:504)|505|821|506|507|(1:509)|510|(1:512)|513)|514|(27:516|(1:518)|519|(1:521)|522|(3:524|(1:526)|527)(16:529|530|(1:532)|533|(1:535)|536|537|(1:539)|540|855|541|542|(1:544)|545|(1:547)|548)|528|549|(1:551)(9:552|(3:554|(4:557|(3:943|559|946)(3:942|560|945)|944|555)|941)|561|562|(1:564)|565|(1:567)|568|569)|570|815|571|(13:830|573|577|578|810|579|(2:827|581)|585|586|(3:588|(4:590|591|(1:593)|594)(3:595|(1:597)|598)|599)(13:600|(2:602|(3:604|(3:606|609|(1:611)(1:612))|613)(2:607|(2:609|(0)(0))(1:613)))|(22:615|616|892|617|618|901|619|(1:621)|622|623|893|624|(1:626)|627|628|629|(1:631)|632|(1:634)|635|(1:637)|638)(1:683)|688|689|905|690|693|694|(1:696)|697|698|699)|639|(4:642|(3:936|644|939)(12:935|645|(3:647|(3:650|651|648)|940)|652|883|653|(1:655)|656|657|877|658|938)|937|640)|934)(11:577|578|810|579|(0)|585|586|(0)(0)|639|(1:640)|934)|700|(1:702)|703|(3:705|(1:707)|708)(13:710|880|711|712|(1:714)|715|828|716|717|(1:719)|720|(1:722)|723)|709|724|(6:727|728|(1:730)|731|732|733)|734|(1:736)|737|(3:739|(1:741)|742)(14:744|745|(1:747)|748|749|(1:751)|752|823|753|754|(1:756)|757|(1:759)|760)|743|761|(1:948)(7:764|765|(1:767)|768|769|770|771))(10:783|(3:785|(2:788|786)|947)|789|790|(1:792)|793|(1:795)|796|797|798)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0cf1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0cf2, code lost:
    
        r8 = new java.lang.Object[1];
        k(((android.content.Context) java.lang.Class.forName(r36).getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1197317132, new char[]{64782, 10211, 35625, 57148, 50139, 42695, 49981, 40610, 22895, 4947, 20110}, new char[]{4403, 41572, 53432, 52579}, new char[]{10177, 38838, 19021, 9904}, (char) (((android.content.Context) java.lang.Class.forName(r36).getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952016_res_0x7f130190).substring(7, 8).codePointAt(0) - 46), r8);
        r3 = (java.lang.String) r8[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0d6c, code lost:
    
        r2 = new java.io.ByteArrayOutputStream();
        r5 = new java.io.PrintStream(r2);
        r0.printStackTrace(r5);
        r5.close();
        r1 = r2.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0d83, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0d87, code lost:
    
        r2 = new java.util.ArrayList(2);
        r2.add(r1);
        r2.add(r3);
        r14 = -1;
        r5 = ((long) 1) & ((((long) 0) << 32) | (r14 - ((r14 >> 63) << 32)));
        r14 = 0;
        r29 = r14 >> 63;
        r5 = r5 | ((((long) 19) << 32) | (r14 - (r29 << 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0db5, code lost:
    
        r3 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
        r29 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0db9, code lost:
    
        if (r3 == null) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0dbb, code lost:
    
        r29 = android.text.TextUtils.indexOf("", "", 0) + 6618;
        r3 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r29, android.view.View.MeasureSpec.getMode(0) + 42, (char) android.graphics.Color.blue(0), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
        r29 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0ddf, code lost:
    
        r3 = ((java.lang.reflect.Method) r3).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0de7, code lost:
    
        r8 = new java.lang.Object[]{1148907664, java.lang.Long.valueOf(r5), r2, null, false};
        r1 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 6562, 56 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) android.view.View.resolveSizeAndState(0, 0, 0));
        r2 = com.huawei.digitalpayment.consumer.remoteconfig.service.FirebaseNotificationService.$$s;
        r10 = new java.lang.Object[1];
        m(r2[4], r2[153(0x99, float:2.14E-43)], r2[37], r10);
        r1.getMethod((java.lang.String) r10[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r3, r8);
        r29 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x1c75, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x1c76, code lost:
    
        r8 = new java.lang.Object[1];
        k(1447065644 - (android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)), new char[]{58840, 61211, 35014, 13219, 32492, 22949, 21086, 14845, 47819, 19346, 18596}, new char[]{11255, 16504, 25686, 32899}, new char[]{10177, 38838, 19021, 9904}, (char) android.widget.ExpandableListView.getPackedPositionType(0), r8);
        r3 = (java.lang.String) r8[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x1cb0, code lost:
    
        r2 = new java.io.ByteArrayOutputStream();
        r4 = new java.io.PrintStream(r2);
        r0.printStackTrace(r4);
        r4.close();
        r1 = r2.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x1cc7, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x1ccb, code lost:
    
        r2 = new java.util.ArrayList(2);
        r2.add(r1);
        r2.add(r3);
        r13 = -1;
        r3 = ((long) 1) & ((((long) 0) << 32) | (r13 - ((r13 >> 63) << 32)));
        r13 = 0;
        r3 = r3 | ((((long) 19) << 32) | (r13 - ((r13 >> 63) << 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x1cfa, code lost:
    
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x1cfe, code lost:
    
        if (r5 == null) goto L484;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x1d00, code lost:
    
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(6618 - android.view.View.getDefaultSize(0, 0), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 42, (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)) - 1), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x1d2e, code lost:
    
        r5 = ((java.lang.reflect.Method) r5).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x1d36, code lost:
    
        r8 = new java.lang.Object[]{1148907664, java.lang.Long.valueOf(r3), r2, null, false};
        r1 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault(6562 - android.view.View.resolveSizeAndState(0, 0, 0), 56 - android.graphics.Color.blue(0), (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1))));
        r2 = com.huawei.digitalpayment.consumer.remoteconfig.service.FirebaseNotificationService.$$s;
        r11 = new java.lang.Object[1];
        m(r2[4], r2[153(0x99, float:2.14E-43)], r2[37], r11);
        r1.getMethod((java.lang.String) r11[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r5, r8);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x08cb A[Catch: all -> 0x03e7, TryCatch #27 {all -> 0x03e7, blocks: (B:394:0x179f, B:396:0x17a5, B:398:0x17d8, B:728:0x317c, B:730:0x3182, B:731:0x31a9, B:765:0x34ba, B:767:0x34c0, B:768:0x34e5, B:745:0x32f6, B:747:0x3319, B:748:0x336f, B:694:0x2e43, B:696:0x2e49, B:697:0x2e72, B:562:0x26d5, B:564:0x26db, B:565:0x26fc, B:567:0x2736, B:568:0x2778, B:530:0x2337, B:532:0x234c, B:533:0x237e, B:535:0x23b2, B:536:0x2429, B:790:0x35c7, B:792:0x35cd, B:793:0x35fb, B:795:0x3635, B:796:0x3677, B:498:0x1f10, B:500:0x1f25, B:501:0x1f58, B:482:0x1cfa, B:484:0x1d00, B:485:0x1d2e, B:252:0x101e, B:254:0x1024, B:255:0x104f, B:207:0x0db5, B:209:0x0dbb, B:210:0x0ddf, B:139:0x08c5, B:141:0x08cb, B:142:0x08f2, B:19:0x0162, B:21:0x0168, B:22:0x0193, B:24:0x0358, B:26:0x038a, B:27:0x03e1, B:146:0x0979, B:148:0x097f, B:149:0x09c6, B:151:0x09d3, B:153:0x09dc, B:154:0x0a22, B:173:0x0bd9, B:181:0x0c43, B:187:0x0cd5, B:189:0x0cdb, B:190:0x0cdc, B:192:0x0cde, B:194:0x0ce5, B:195:0x0ce6, B:156:0x0a2e, B:163:0x0ab7, B:165:0x0abd, B:166:0x0b02, B:168:0x0b2c, B:169:0x0b6d, B:171:0x0b83, B:172:0x0bd1, B:197:0x0ce8, B:199:0x0cef, B:200:0x0cf0, B:402:0x185f, B:404:0x1865, B:405:0x18aa, B:407:0x18b7, B:409:0x18c0, B:410:0x18fe, B:434:0x1b22, B:435:0x1b26, B:437:0x1b2c, B:440:0x1b46, B:443:0x1b5c, B:445:0x1b5f, B:457:0x1c4f, B:459:0x1c55, B:460:0x1c56, B:462:0x1c58, B:464:0x1c5f, B:465:0x1c60, B:411:0x1909, B:423:0x1a00, B:425:0x1a06, B:426:0x1a47, B:428:0x1a71, B:430:0x1abc, B:432:0x1ad3, B:433:0x1b1a, B:467:0x1c62, B:469:0x1c69, B:470:0x1c6a, B:472:0x1c6c, B:474:0x1c73, B:475:0x1c74, B:215:0x0e67, B:217:0x0e6b, B:238:0x0f4c, B:240:0x0f52, B:241:0x0f53, B:243:0x0f55, B:245:0x0f5c, B:246:0x0f5d, B:221:0x0e77), top: B:861:0x0162, inners: #34, #37, #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x097f A[Catch: all -> 0x0cf1, TryCatch #34 {all -> 0x0cf1, blocks: (B:146:0x0979, B:148:0x097f, B:149:0x09c6, B:151:0x09d3, B:153:0x09dc, B:154:0x0a22, B:173:0x0bd9, B:181:0x0c43, B:187:0x0cd5, B:189:0x0cdb, B:190:0x0cdc, B:192:0x0cde, B:194:0x0ce5, B:195:0x0ce6, B:156:0x0a2e, B:163:0x0ab7, B:165:0x0abd, B:166:0x0b02, B:168:0x0b2c, B:169:0x0b6d, B:171:0x0b83, B:172:0x0bd1, B:197:0x0ce8, B:199:0x0cef, B:200:0x0cf0, B:183:0x0c53, B:177:0x0c09, B:179:0x0c0f, B:180:0x0c3c, B:158:0x0a4e, B:160:0x0a60, B:161:0x0aab), top: B:874:0x0979, outer: #27, inners: #19, #23, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x09d3 A[Catch: all -> 0x0cf1, TryCatch #34 {all -> 0x0cf1, blocks: (B:146:0x0979, B:148:0x097f, B:149:0x09c6, B:151:0x09d3, B:153:0x09dc, B:154:0x0a22, B:173:0x0bd9, B:181:0x0c43, B:187:0x0cd5, B:189:0x0cdb, B:190:0x0cdc, B:192:0x0cde, B:194:0x0ce5, B:195:0x0ce6, B:156:0x0a2e, B:163:0x0ab7, B:165:0x0abd, B:166:0x0b02, B:168:0x0b2c, B:169:0x0b6d, B:171:0x0b83, B:172:0x0bd1, B:197:0x0ce8, B:199:0x0cef, B:200:0x0cf0, B:183:0x0c53, B:177:0x0c09, B:179:0x0c0f, B:180:0x0c3c, B:158:0x0a4e, B:160:0x0a60, B:161:0x0aab), top: B:874:0x0979, outer: #27, inners: #19, #23, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0a2e A[Catch: all -> 0x0cf1, TRY_LEAVE, TryCatch #34 {all -> 0x0cf1, blocks: (B:146:0x0979, B:148:0x097f, B:149:0x09c6, B:151:0x09d3, B:153:0x09dc, B:154:0x0a22, B:173:0x0bd9, B:181:0x0c43, B:187:0x0cd5, B:189:0x0cdb, B:190:0x0cdc, B:192:0x0cde, B:194:0x0ce5, B:195:0x0ce6, B:156:0x0a2e, B:163:0x0ab7, B:165:0x0abd, B:166:0x0b02, B:168:0x0b2c, B:169:0x0b6d, B:171:0x0b83, B:172:0x0bd1, B:197:0x0ce8, B:199:0x0cef, B:200:0x0cf0, B:183:0x0c53, B:177:0x0c09, B:179:0x0c0f, B:180:0x0c3c, B:158:0x0a4e, B:160:0x0a60, B:161:0x0aab), top: B:874:0x0979, outer: #27, inners: #19, #23, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0beb  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0e80  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0e97 A[Catch: all -> 0x0f54, TryCatch #21 {all -> 0x0f54, blocks: (B:227:0x0e82, B:229:0x0e97, B:230:0x0ec3), top: B:849:0x0e82, outer: #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0ed6 A[Catch: all -> 0x0f4a, TryCatch #16 {all -> 0x0f4a, blocks: (B:231:0x0ec9, B:233:0x0ed6, B:234:0x0f42), top: B:839:0x0ec9, outer: #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x112a A[Catch: all -> 0x16d4, PHI: r2 r29
  0x112a: PHI (r2v600 java.lang.Object) = (r2v594 java.lang.Object), (r2v599 java.lang.Object) binds: [B:260:0x10da, B:261:0x10dc] A[DONT_GENERATE, DONT_INLINE]
  0x112a: PHI (r29v87 float) = (r29v188 float), (r29v189 float) binds: [B:260:0x10da, B:261:0x10dc] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #20 {all -> 0x16d4, blocks: (B:259:0x10d6, B:265:0x112a), top: B:847:0x10d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x1151  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x11a4  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x11bc  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x121d  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x1562  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x17a5 A[Catch: all -> 0x03e7, TryCatch #27 {all -> 0x03e7, blocks: (B:394:0x179f, B:396:0x17a5, B:398:0x17d8, B:728:0x317c, B:730:0x3182, B:731:0x31a9, B:765:0x34ba, B:767:0x34c0, B:768:0x34e5, B:745:0x32f6, B:747:0x3319, B:748:0x336f, B:694:0x2e43, B:696:0x2e49, B:697:0x2e72, B:562:0x26d5, B:564:0x26db, B:565:0x26fc, B:567:0x2736, B:568:0x2778, B:530:0x2337, B:532:0x234c, B:533:0x237e, B:535:0x23b2, B:536:0x2429, B:790:0x35c7, B:792:0x35cd, B:793:0x35fb, B:795:0x3635, B:796:0x3677, B:498:0x1f10, B:500:0x1f25, B:501:0x1f58, B:482:0x1cfa, B:484:0x1d00, B:485:0x1d2e, B:252:0x101e, B:254:0x1024, B:255:0x104f, B:207:0x0db5, B:209:0x0dbb, B:210:0x0ddf, B:139:0x08c5, B:141:0x08cb, B:142:0x08f2, B:19:0x0162, B:21:0x0168, B:22:0x0193, B:24:0x0358, B:26:0x038a, B:27:0x03e1, B:146:0x0979, B:148:0x097f, B:149:0x09c6, B:151:0x09d3, B:153:0x09dc, B:154:0x0a22, B:173:0x0bd9, B:181:0x0c43, B:187:0x0cd5, B:189:0x0cdb, B:190:0x0cdc, B:192:0x0cde, B:194:0x0ce5, B:195:0x0ce6, B:156:0x0a2e, B:163:0x0ab7, B:165:0x0abd, B:166:0x0b02, B:168:0x0b2c, B:169:0x0b6d, B:171:0x0b83, B:172:0x0bd1, B:197:0x0ce8, B:199:0x0cef, B:200:0x0cf0, B:402:0x185f, B:404:0x1865, B:405:0x18aa, B:407:0x18b7, B:409:0x18c0, B:410:0x18fe, B:434:0x1b22, B:435:0x1b26, B:437:0x1b2c, B:440:0x1b46, B:443:0x1b5c, B:445:0x1b5f, B:457:0x1c4f, B:459:0x1c55, B:460:0x1c56, B:462:0x1c58, B:464:0x1c5f, B:465:0x1c60, B:411:0x1909, B:423:0x1a00, B:425:0x1a06, B:426:0x1a47, B:428:0x1a71, B:430:0x1abc, B:432:0x1ad3, B:433:0x1b1a, B:467:0x1c62, B:469:0x1c69, B:470:0x1c6a, B:472:0x1c6c, B:474:0x1c73, B:475:0x1c74, B:215:0x0e67, B:217:0x0e6b, B:238:0x0f4c, B:240:0x0f52, B:241:0x0f53, B:243:0x0f55, B:245:0x0f5c, B:246:0x0f5d, B:221:0x0e77), top: B:861:0x0162, inners: #34, #37, #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:397:0x17d6  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x1865 A[Catch: all -> 0x1c75, TryCatch #37 {all -> 0x1c75, blocks: (B:402:0x185f, B:404:0x1865, B:405:0x18aa, B:407:0x18b7, B:409:0x18c0, B:410:0x18fe, B:434:0x1b22, B:435:0x1b26, B:437:0x1b2c, B:440:0x1b46, B:443:0x1b5c, B:445:0x1b5f, B:457:0x1c4f, B:459:0x1c55, B:460:0x1c56, B:462:0x1c58, B:464:0x1c5f, B:465:0x1c60, B:411:0x1909, B:423:0x1a00, B:425:0x1a06, B:426:0x1a47, B:428:0x1a71, B:430:0x1abc, B:432:0x1ad3, B:433:0x1b1a, B:467:0x1c62, B:469:0x1c69, B:470:0x1c6a, B:472:0x1c6c, B:474:0x1c73, B:475:0x1c74, B:453:0x1bce, B:448:0x1b8e, B:450:0x1b94, B:451:0x1bbc, B:418:0x1972, B:420:0x1987, B:421:0x19f4, B:413:0x1929, B:415:0x193e, B:416:0x196b), top: B:879:0x185f, outer: #27, inners: #17, #22, #25, #31 }] */
    /* JADX WARN: Removed duplicated region for block: B:407:0x18b7 A[Catch: all -> 0x1c75, TryCatch #37 {all -> 0x1c75, blocks: (B:402:0x185f, B:404:0x1865, B:405:0x18aa, B:407:0x18b7, B:409:0x18c0, B:410:0x18fe, B:434:0x1b22, B:435:0x1b26, B:437:0x1b2c, B:440:0x1b46, B:443:0x1b5c, B:445:0x1b5f, B:457:0x1c4f, B:459:0x1c55, B:460:0x1c56, B:462:0x1c58, B:464:0x1c5f, B:465:0x1c60, B:411:0x1909, B:423:0x1a00, B:425:0x1a06, B:426:0x1a47, B:428:0x1a71, B:430:0x1abc, B:432:0x1ad3, B:433:0x1b1a, B:467:0x1c62, B:469:0x1c69, B:470:0x1c6a, B:472:0x1c6c, B:474:0x1c73, B:475:0x1c74, B:453:0x1bce, B:448:0x1b8e, B:450:0x1b94, B:451:0x1bbc, B:418:0x1972, B:420:0x1987, B:421:0x19f4, B:413:0x1929, B:415:0x193e, B:416:0x196b), top: B:879:0x185f, outer: #27, inners: #17, #22, #25, #31 }] */
    /* JADX WARN: Removed duplicated region for block: B:411:0x1909 A[Catch: all -> 0x1c75, TRY_LEAVE, TryCatch #37 {all -> 0x1c75, blocks: (B:402:0x185f, B:404:0x1865, B:405:0x18aa, B:407:0x18b7, B:409:0x18c0, B:410:0x18fe, B:434:0x1b22, B:435:0x1b26, B:437:0x1b2c, B:440:0x1b46, B:443:0x1b5c, B:445:0x1b5f, B:457:0x1c4f, B:459:0x1c55, B:460:0x1c56, B:462:0x1c58, B:464:0x1c5f, B:465:0x1c60, B:411:0x1909, B:423:0x1a00, B:425:0x1a06, B:426:0x1a47, B:428:0x1a71, B:430:0x1abc, B:432:0x1ad3, B:433:0x1b1a, B:467:0x1c62, B:469:0x1c69, B:470:0x1c6a, B:472:0x1c6c, B:474:0x1c73, B:475:0x1c74, B:453:0x1bce, B:448:0x1b8e, B:450:0x1b94, B:451:0x1bbc, B:418:0x1972, B:420:0x1987, B:421:0x19f4, B:413:0x1929, B:415:0x193e, B:416:0x196b), top: B:879:0x185f, outer: #27, inners: #17, #22, #25, #31 }] */
    /* JADX WARN: Removed duplicated region for block: B:437:0x1b2c A[Catch: all -> 0x1c75, TryCatch #37 {all -> 0x1c75, blocks: (B:402:0x185f, B:404:0x1865, B:405:0x18aa, B:407:0x18b7, B:409:0x18c0, B:410:0x18fe, B:434:0x1b22, B:435:0x1b26, B:437:0x1b2c, B:440:0x1b46, B:443:0x1b5c, B:445:0x1b5f, B:457:0x1c4f, B:459:0x1c55, B:460:0x1c56, B:462:0x1c58, B:464:0x1c5f, B:465:0x1c60, B:411:0x1909, B:423:0x1a00, B:425:0x1a06, B:426:0x1a47, B:428:0x1a71, B:430:0x1abc, B:432:0x1ad3, B:433:0x1b1a, B:467:0x1c62, B:469:0x1c69, B:470:0x1c6a, B:472:0x1c6c, B:474:0x1c73, B:475:0x1c74, B:453:0x1bce, B:448:0x1b8e, B:450:0x1b94, B:451:0x1bbc, B:418:0x1972, B:420:0x1987, B:421:0x19f4, B:413:0x1929, B:415:0x193e, B:416:0x196b), top: B:879:0x185f, outer: #27, inners: #17, #22, #25, #31 }] */
    /* JADX WARN: Removed duplicated region for block: B:490:0x1dbb  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x1e10  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x1ef0  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x2091  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x2944  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x2a01  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x2a27  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x2a28  */
    /* JADX WARN: Removed duplicated region for block: B:642:0x2c69 A[Catch: all -> 0x2d86, TryCatch #45 {all -> 0x2d86, blocks: (B:639:0x2c5f, B:640:0x2c63, B:642:0x2c69, B:645:0x2c81, B:648:0x2c8e, B:650:0x2c91, B:662:0x2d74, B:664:0x2d7a, B:665:0x2d7b, B:667:0x2d7d, B:669:0x2d84, B:670:0x2d85, B:617:0x2a3e, B:629:0x2b43, B:631:0x2b49, B:632:0x2b8c, B:634:0x2bb6, B:635:0x2bfb, B:637:0x2c11, B:638:0x2c59, B:674:0x2d89, B:676:0x2d90, B:677:0x2d91, B:679:0x2d93, B:681:0x2d9a, B:682:0x2d9b, B:658:0x2cf2, B:653:0x2cbd, B:655:0x2cc3, B:656:0x2cea, B:624:0x2aa2, B:626:0x2ac1, B:627:0x2b37, B:619:0x2a52, B:621:0x2a67, B:622:0x2a9b), top: B:892:0x2a3e, inners: #36, #40, #46, #50 }] */
    /* JADX WARN: Removed duplicated region for block: B:696:0x2e49 A[Catch: all -> 0x03e7, TryCatch #27 {all -> 0x03e7, blocks: (B:394:0x179f, B:396:0x17a5, B:398:0x17d8, B:728:0x317c, B:730:0x3182, B:731:0x31a9, B:765:0x34ba, B:767:0x34c0, B:768:0x34e5, B:745:0x32f6, B:747:0x3319, B:748:0x336f, B:694:0x2e43, B:696:0x2e49, B:697:0x2e72, B:562:0x26d5, B:564:0x26db, B:565:0x26fc, B:567:0x2736, B:568:0x2778, B:530:0x2337, B:532:0x234c, B:533:0x237e, B:535:0x23b2, B:536:0x2429, B:790:0x35c7, B:792:0x35cd, B:793:0x35fb, B:795:0x3635, B:796:0x3677, B:498:0x1f10, B:500:0x1f25, B:501:0x1f58, B:482:0x1cfa, B:484:0x1d00, B:485:0x1d2e, B:252:0x101e, B:254:0x1024, B:255:0x104f, B:207:0x0db5, B:209:0x0dbb, B:210:0x0ddf, B:139:0x08c5, B:141:0x08cb, B:142:0x08f2, B:19:0x0162, B:21:0x0168, B:22:0x0193, B:24:0x0358, B:26:0x038a, B:27:0x03e1, B:146:0x0979, B:148:0x097f, B:149:0x09c6, B:151:0x09d3, B:153:0x09dc, B:154:0x0a22, B:173:0x0bd9, B:181:0x0c43, B:187:0x0cd5, B:189:0x0cdb, B:190:0x0cdc, B:192:0x0cde, B:194:0x0ce5, B:195:0x0ce6, B:156:0x0a2e, B:163:0x0ab7, B:165:0x0abd, B:166:0x0b02, B:168:0x0b2c, B:169:0x0b6d, B:171:0x0b83, B:172:0x0bd1, B:197:0x0ce8, B:199:0x0cef, B:200:0x0cf0, B:402:0x185f, B:404:0x1865, B:405:0x18aa, B:407:0x18b7, B:409:0x18c0, B:410:0x18fe, B:434:0x1b22, B:435:0x1b26, B:437:0x1b2c, B:440:0x1b46, B:443:0x1b5c, B:445:0x1b5f, B:457:0x1c4f, B:459:0x1c55, B:460:0x1c56, B:462:0x1c58, B:464:0x1c5f, B:465:0x1c60, B:411:0x1909, B:423:0x1a00, B:425:0x1a06, B:426:0x1a47, B:428:0x1a71, B:430:0x1abc, B:432:0x1ad3, B:433:0x1b1a, B:467:0x1c62, B:469:0x1c69, B:470:0x1c6a, B:472:0x1c6c, B:474:0x1c73, B:475:0x1c74, B:215:0x0e67, B:217:0x0e6b, B:238:0x0f4c, B:240:0x0f52, B:241:0x0f53, B:243:0x0f55, B:245:0x0f5c, B:246:0x0f5d, B:221:0x0e77), top: B:861:0x0162, inners: #34, #37, #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:783:0x3586  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:813:0x10dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:827:0x28e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:885:0x0e67 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v100 */
    /* JADX WARN: Type inference failed for: r10v105, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v108 */
    /* JADX WARN: Type inference failed for: r10v109 */
    /* JADX WARN: Type inference failed for: r10v110 */
    /* JADX WARN: Type inference failed for: r10v111 */
    /* JADX WARN: Type inference failed for: r10v112 */
    /* JADX WARN: Type inference failed for: r10v114 */
    /* JADX WARN: Type inference failed for: r10v189 */
    /* JADX WARN: Type inference failed for: r10v190 */
    /* JADX WARN: Type inference failed for: r10v191 */
    /* JADX WARN: Type inference failed for: r10v192 */
    /* JADX WARN: Type inference failed for: r10v193 */
    /* JADX WARN: Type inference failed for: r10v194 */
    /* JADX WARN: Type inference failed for: r10v195 */
    /* JADX WARN: Type inference failed for: r10v196 */
    /* JADX WARN: Type inference failed for: r10v197 */
    /* JADX WARN: Type inference failed for: r10v198 */
    /* JADX WARN: Type inference failed for: r10v199 */
    /* JADX WARN: Type inference failed for: r10v200 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v38, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v67 */
    /* JADX WARN: Type inference failed for: r10v68, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v76 */
    /* JADX WARN: Type inference failed for: r10v77 */
    /* JADX WARN: Type inference failed for: r10v78 */
    /* JADX WARN: Type inference failed for: r10v80, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v81 */
    /* JADX WARN: Type inference failed for: r10v82 */
    /* JADX WARN: Type inference failed for: r10v84 */
    /* JADX WARN: Type inference failed for: r10v86 */
    /* JADX WARN: Type inference failed for: r10v87 */
    /* JADX WARN: Type inference failed for: r10v88 */
    /* JADX WARN: Type inference failed for: r10v91 */
    /* JADX WARN: Type inference failed for: r10v93 */
    /* JADX WARN: Type inference failed for: r10v99 */
    /* JADX WARN: Type inference failed for: r13v136 */
    /* JADX WARN: Type inference failed for: r13v137 */
    /* JADX WARN: Type inference failed for: r13v138 */
    /* JADX WARN: Type inference failed for: r13v139 */
    /* JADX WARN: Type inference failed for: r13v151 */
    /* JADX WARN: Type inference failed for: r13v155 */
    /* JADX WARN: Type inference failed for: r13v156 */
    /* JADX WARN: Type inference failed for: r13v160 */
    /* JADX WARN: Type inference failed for: r13v161 */
    /* JADX WARN: Type inference failed for: r13v162 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v36, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v40 */
    /* JADX WARN: Type inference failed for: r29v102 */
    /* JADX WARN: Type inference failed for: r29v103 */
    /* JADX WARN: Type inference failed for: r29v104 */
    /* JADX WARN: Type inference failed for: r29v105 */
    /* JADX WARN: Type inference failed for: r29v108 */
    /* JADX WARN: Type inference failed for: r29v109 */
    /* JADX WARN: Type inference failed for: r29v110 */
    /* JADX WARN: Type inference failed for: r29v112 */
    /* JADX WARN: Type inference failed for: r29v190 */
    /* JADX WARN: Type inference failed for: r29v191 */
    /* JADX WARN: Type inference failed for: r29v192 */
    /* JADX WARN: Type inference failed for: r29v193 */
    /* JADX WARN: Type inference failed for: r29v26 */
    /* JADX WARN: Type inference failed for: r29v27 */
    /* JADX WARN: Type inference failed for: r29v84 */
    /* JADX WARN: Type inference failed for: r29v85 */
    /* JADX WARN: Type inference failed for: r29v88 */
    /* JADX WARN: Type inference failed for: r29v89 */
    /* JADX WARN: Type inference failed for: r29v90 */
    /* JADX WARN: Type inference failed for: r29v91 */
    /* JADX WARN: Type inference failed for: r43v12 */
    /* JADX WARN: Type inference failed for: r43v13 */
    /* JADX WARN: Type inference failed for: r43v18 */
    /* JADX WARN: Type inference failed for: r43v19 */
    /* JADX WARN: Type inference failed for: r43v2 */
    /* JADX WARN: Type inference failed for: r43v20 */
    /* JADX WARN: Type inference failed for: r43v25 */
    /* JADX WARN: Type inference failed for: r43v3 */
    /* JADX WARN: Type inference failed for: r43v7 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v349 */
    /* JADX WARN: Type inference failed for: r4v350 */
    /* JADX WARN: Type inference failed for: r4v351 */
    /* JADX WARN: Type inference failed for: r4v366 */
    /* JADX WARN: Type inference failed for: r4v367 */
    /* JADX WARN: Type inference failed for: r7v151 */
    /* JADX WARN: Type inference failed for: r7v253 */
    /* JADX WARN: Type inference failed for: r7v254 */
    /* JADX WARN: Type inference failed for: r7v70, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v82 */
    /* JADX WARN: Type inference failed for: r7v83 */
    /* JADX WARN: Type inference failed for: r7v84, types: [java.lang.CharSequence] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r52) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.remoteconfig.service.FirebaseNotificationService.attachBaseContext(android.content.Context):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x074d  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.remoteconfig.service.FirebaseNotificationService.onCreate():void");
    }
}
