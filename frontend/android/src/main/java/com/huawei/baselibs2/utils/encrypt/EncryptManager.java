package com.huawei.baselibs2.utils.encrypt;

import android.graphics.Color;
import android.os.SystemClock;
import android.security.KeyPairGeneratorSpec;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.util.Utils;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.common.util.L;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Calendar;
import javax.crypto.Cipher;
import javax.security.auth.x500.X500Principal;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.getActiveNotifications;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0010\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/huawei/baselibs2/utils/encrypt/EncryptManager;", "Lcom/huawei/baselibs2/utils/encrypt/EncryptInterface;", "<init>", "()V", "TAG", "", "KeyStoreType", "RSA_ALIAS", "AES_ALIAS", "x500PrincipalName", "RSA_MODE_OAEP", "RSA", "RSA_ENCRYPT_BLOCK", "", "RSA_DECRYPT_BLOCK", "IV_BLOCK_SIZE", "encrypt", "keyStore", "Ljava/security/KeyStore;", "kotlin.jvm.PlatformType", "Ljava/security/KeyStore;", "content", "decrypt", "RSAEncrypt", "AESEncrypt", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EncryptManager implements EncryptInterface {
    public static final EncryptManager INSTANCE = new EncryptManager();
    private static final int ShareDataUIState = 16;
    private static final String component1 = "aes_public_key_alias";
    private static final String component2 = "RSA";
    private static final String component3 = "AndroidKeyStore";
    private static final String component4 = "EncryptManager";
    private static final EncryptInterface copy;
    private static final String copydefault = "rsa_public_key_alias";
    private static final int equals = 256;
    private static final String getAsAtTimestamp = "RSA/ECB/OAEPPadding";
    private static final int getRequestBeneficiariesState = 244;
    private static final KeyStore getSponsorBeneficiariesState;
    private static final String toString = "CN=MyKey, O=Android Authority";

    private EncryptManager() {
    }

    static {
        copydefault copydefaultVar = new copydefault();
        L.d(component4, "init: " + copydefaultVar);
        copy = copydefaultVar;
        KeyStore keyStore = KeyStore.getInstance(component3);
        keyStore.load(null);
        getSponsorBeneficiariesState = keyStore;
    }

    @Override
    public String encrypt(String content) {
        return copy.encrypt(content);
    }

    @Override
    public String decrypt(String content) {
        return copy.decrypt(content);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\b\u001a\u00020\tH\u0002¨\u0006\n"}, d2 = {"Lcom/huawei/baselibs2/utils/encrypt/EncryptManager$RSAEncrypt;", "Lcom/huawei/baselibs2/utils/encrypt/EncryptInterface;", "<init>", "()V", "encrypt", "", "content", "decrypt", "createNewKeys", "", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class ShareDataUIState implements EncryptInterface {
        @Override
        public String encrypt(String content) {
            Cipher cipher;
            ByteArrayOutputStream byteArrayOutputStream;
            int length;
            byte[] bytes;
            int i;
            int i2;
            byte[] bArrDoFinal;
            if (TextUtils.isEmpty(content)) {
                return "";
            }
            synchronized (EncryptManager.class) {
                component2();
                try {
                    PublicKey publicKey = EncryptManager.getSponsorBeneficiariesState.getCertificate(EncryptManager.copydefault).getPublicKey();
                    cipher = Cipher.getInstance(EncryptManager.getAsAtTimestamp);
                    cipher.init(1, publicKey);
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    Intrinsics.checkNotNull(content);
                    length = content.length();
                    bytes = content.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "");
                    i = 0;
                    i2 = 0;
                } catch (Exception e) {
                    L.e(EncryptManager.component4, "encrypt error:" + e.getMessage());
                }
                while (true) {
                    int i3 = length - i;
                    if (i3 <= 0) {
                        break;
                    }
                    if (i3 > EncryptManager.getRequestBeneficiariesState) {
                        bArrDoFinal = cipher.doFinal(bytes, i, EncryptManager.getRequestBeneficiariesState);
                        Intrinsics.checkNotNull(bArrDoFinal);
                    } else {
                        bArrDoFinal = cipher.doFinal(bytes, i, i3);
                        Intrinsics.checkNotNull(bArrDoFinal);
                    }
                    byteArrayOutputStream.write(bArrDoFinal, 0, bArrDoFinal.length);
                    i2++;
                    i = i2 * EncryptManager.getRequestBeneficiariesState;
                    Unit unit = Unit.INSTANCE;
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                content = Base64.encodeToString(byteArray, 2);
                Unit unit2 = Unit.INSTANCE;
            }
            return content == null ? "" : content;
        }

        @Override
        public String decrypt(String content) {
            Cipher cipher;
            ByteArrayOutputStream byteArrayOutputStream;
            byte[] bArrDecode;
            int length;
            int i;
            int i2;
            byte[] bArrDoFinal;
            if (TextUtils.isEmpty(content)) {
                return "";
            }
            synchronized (EncryptManager.class) {
                component2();
                try {
                    Key key = EncryptManager.getSponsorBeneficiariesState.getKey(EncryptManager.copydefault, null);
                    Intrinsics.checkNotNull(key, "");
                    cipher = Cipher.getInstance(EncryptManager.getAsAtTimestamp);
                    cipher.init(2, (PrivateKey) key);
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    bArrDecode = Base64.decode(content, 2);
                    Intrinsics.checkNotNullExpressionValue(bArrDecode, "");
                    length = bArrDecode.length;
                    i = 0;
                    i2 = 0;
                } catch (Exception e) {
                    L.e(EncryptManager.component4, "decrypt error:" + e.getMessage());
                }
                while (true) {
                    int i3 = length - i;
                    if (i3 <= 0) {
                        break;
                    }
                    if (i3 > 256) {
                        bArrDoFinal = cipher.doFinal(bArrDecode, i, 256);
                        Intrinsics.checkNotNull(bArrDoFinal);
                    } else {
                        bArrDoFinal = cipher.doFinal(bArrDecode, i, i3);
                        Intrinsics.checkNotNull(bArrDoFinal);
                    }
                    byteArrayOutputStream.write(bArrDoFinal, 0, bArrDoFinal.length);
                    i2++;
                    i = i2 * 256;
                    Unit unit = Unit.INSTANCE;
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                Intrinsics.checkNotNull(byteArray);
                int length2 = byteArray.length;
                Charset charset = StandardCharsets.UTF_8;
                Intrinsics.checkNotNullExpressionValue(charset, "");
                content = new String(byteArray, 0, length2, charset);
                Unit unit2 = Unit.INSTANCE;
            }
            return content == null ? "" : content;
        }

        private final void component2() {
            if (EncryptManager.getSponsorBeneficiariesState.containsAlias(EncryptManager.copydefault)) {
                return;
            }
            try {
                Calendar calendar = Calendar.getInstance();
                Calendar calendar2 = Calendar.getInstance();
                calendar2.add(1, 1000);
                KeyPairGeneratorSpec keyPairGeneratorSpecBuild = new KeyPairGeneratorSpec.Builder(Utils.getApp()).setAlias(EncryptManager.copydefault).setSubject(new X500Principal(EncryptManager.toString)).setSerialNumber(BigInteger.ONE).setStartDate(calendar.getTime()).setEndDate(calendar2.getTime()).build();
                Intrinsics.checkNotNullExpressionValue(keyPairGeneratorSpecBuild, "");
                KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", EncryptManager.component3);
                keyPairGenerator.initialize(keyPairGeneratorSpecBuild);
                keyPairGenerator.generateKeyPair();
            } catch (Exception e) {
                L.e(EncryptManager.component4, "createNewKeys: " + e.getMessage());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0002¨\u0006\n"}, d2 = {"Lcom/huawei/baselibs2/utils/encrypt/EncryptManager$AESEncrypt;", "Lcom/huawei/baselibs2/utils/encrypt/EncryptInterface;", "<init>", "()V", "encrypt", "", "content", "decrypt", "loadNoInitCipher", "Ljavax/crypto/Cipher;", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class copydefault implements EncryptInterface {
        private static final byte[] $$c = {Ascii.SI, 58, -59};
        private static final int $$f = 228;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {TarHeader.LF_BLK, -58, -85, 74, -39, -25, -30, -26, -26, -18, -36, -33, 39, -39, -28, -36};
        private static final int $$e = 69;
        private static final byte[] $$a = {120, -46, -95, -23, -1, -31, Ascii.VT, -33, SignedBytes.MAX_POWER_OF_TWO, -63, -25, -17, -1, -14, -5, TarHeader.LF_CONTIG, -31, -48, -17, -2, -7, -23, -8, -25, 33, -47, -15, -11, 9, -23, 1, -12, -21, Ascii.US, -45, -15, 3, -21};
        private static final int $$b = 69;
        private static int component1 = 0;
        private static int component3 = 1;
        private static int[] ShareDataUIState = {-681783523, -1037435231, 1738015371, 616179668, 475205304, -71161965, -1835191414, -1904912993, -344885664, -2056684072, -931625382, 2131210426, -766934462, 1098308552, 1405033449, 9531183, -1567624689, 1114283585};

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$g(short r7, short r8, int r9) {
            /*
                byte[] r0 = com.huawei.baselibs2.utils.encrypt.EncryptManager.copydefault.$$c
                int r7 = r7 * 3
                int r7 = 3 - r7
                int r9 = r9 * 4
                int r9 = r9 + 1
                int r8 = r8 + 104
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L15
                r8 = r7
                r3 = r9
                r5 = r2
                goto L29
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r8
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r9) goto L23
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L23:
                r3 = r0[r7]
                r6 = r8
                r8 = r7
                r7 = r3
                r3 = r6
            L29:
                int r7 = -r7
                int r7 = r7 + r3
                int r8 = r8 + 1
                r3 = r5
                r6 = r8
                r8 = r7
                r7 = r6
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.baselibs2.utils.encrypt.EncryptManager.copydefault.$$g(short, short, int):java.lang.String");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(short r6, int r7, byte r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = com.huawei.baselibs2.utils.encrypt.EncryptManager.copydefault.$$a
                int r7 = r7 * 3
                int r7 = 106 - r7
                int r6 = r6 * 2
                int r6 = r6 + 4
                int r8 = r8 * 4
                int r1 = r8 + 7
                byte[] r1 = new byte[r1]
                int r8 = r8 + 6
                r2 = 0
                if (r0 != 0) goto L19
                r7 = r6
                r3 = r8
                r4 = r2
                goto L2f
            L19:
                r3 = r2
            L1a:
                byte r4 = (byte) r7
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r8) goto L29
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L29:
                r3 = r0[r6]
                r5 = r7
                r7 = r6
                r6 = r3
                r3 = r5
            L2f:
                int r6 = -r6
                int r7 = r7 + 1
                int r3 = r3 + r6
                int r6 = r3 + (-10)
                r3 = r4
                r5 = r7
                r7 = r6
                r6 = r5
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.baselibs2.utils.encrypt.EncryptManager.copydefault.a(short, int, byte, java.lang.Object[]):void");
        }

        private static void b(short s, short s2, byte b2, Object[] objArr) {
            int i = 12 - (b2 * 9);
            int i2 = s2 + 98;
            byte[] bArr = $$d;
            int i3 = s * 3;
            byte[] bArr2 = new byte[10 - i3];
            int i4 = 9 - i3;
            int i5 = -1;
            if (bArr == null) {
                i2 = (i2 + (-i)) - 27;
                i = i;
                i5 = -1;
            }
            while (true) {
                int i6 = i5 + 1;
                bArr2[i6] = (byte) i2;
                int i7 = i + 1;
                if (i6 == i4) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                } else {
                    i2 = (i2 + (-bArr[i7])) - 27;
                    i = i7;
                    i5 = i6;
                }
            }
        }

        private static void c(int i, int[] iArr, Object[] objArr) throws Throwable {
            int i2;
            int length;
            int[] iArr2;
            int i3 = 2;
            int i4 = 2 % 2;
            getActiveNotifications getactivenotifications = new getActiveNotifications();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr3 = ShareDataUIState;
            int i5 = 684241640;
            int i6 = 1;
            int i7 = 0;
            if (iArr3 != null) {
                int length2 = iArr3.length;
                int[] iArr4 = new int[length2];
                int i8 = 0;
                while (i8 < length2) {
                    int i9 = $10 + 27;
                    $11 = i9 % 128;
                    if (i9 % i3 == 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(iArr3[i8])};
                            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i5);
                            if (objCopydefault == null) {
                                byte b2 = (byte) 0;
                                byte b3 = (byte) (b2 + 2);
                                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 4391, 'U' - AndroidCharacter.getMirror('0'), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), -309236339, false, $$g(b2, b3, (byte) (b3 - 2)), new Class[]{Integer.TYPE});
                            }
                            iArr4[i8] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(iArr3[i8])};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                        if (objCopydefault2 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = (byte) (b4 + 2);
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(4391 - (ViewConfiguration.getJumpTapTimeout() >> 16), 37 - KeyEvent.getDeadChar(0, 0), (char) Color.alpha(0), -309236339, false, $$g(b4, b5, (byte) (b5 - 2)), new Class[]{Integer.TYPE});
                        }
                        iArr4[i8] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    }
                    i8++;
                    i3 = 2;
                    i5 = 684241640;
                }
                iArr3 = iArr4;
            }
            int length3 = iArr3.length;
            int[] iArr5 = new int[length3];
            int[] iArr6 = ShareDataUIState;
            if (iArr6 != null) {
                int i10 = $10 + 77;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    length = iArr6.length;
                    iArr2 = new int[length];
                } else {
                    length = iArr6.length;
                    iArr2 = new int[length];
                }
                int i11 = 0;
                while (i11 < length) {
                    int i12 = $11 + 69;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    Object[] objArr4 = new Object[i6];
                    objArr4[i7] = Integer.valueOf(iArr6[i11]);
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault3 == null) {
                        byte b6 = (byte) i7;
                        byte b7 = (byte) (b6 + 2);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4391 - View.resolveSizeAndState(i7, i7, i7), 37 - Color.blue(i7), (char) TextUtils.getTrimmedLength(""), -309236339, false, $$g(b6, b7, (byte) (b7 - 2)), new Class[]{Integer.TYPE});
                    }
                    iArr2[i11] = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                    i11++;
                    i6 = 1;
                    i7 = 0;
                }
                int i14 = $11 + 51;
                $10 = i14 % 128;
                int i15 = i14 % 2;
                iArr6 = iArr2;
                i2 = 0;
            } else {
                i2 = 0;
            }
            System.arraycopy(iArr6, i2, iArr5, i2, length3);
            getactivenotifications.component1 = i2;
            while (getactivenotifications.component1 < iArr.length) {
                cArr[i2] = (char) (iArr[getactivenotifications.component1] >> 16);
                cArr[1] = (char) iArr[getactivenotifications.component1];
                cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
                cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
                getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
                getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
                getActiveNotifications.component2(iArr5);
                int i16 = 0;
                for (int i17 = 16; i16 < i17; i17 = 16) {
                    getactivenotifications.ShareDataUIState ^= iArr5[i16];
                    Object[] objArr5 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                    if (objCopydefault4 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2967, 16 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (View.combineMeasuredStates(0, 0) + 49871), 462826032, false, $$g(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                    getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                    getactivenotifications.component2 = iIntValue;
                    i16++;
                }
                int i18 = getactivenotifications.ShareDataUIState;
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = i18;
                getactivenotifications.component2 ^= iArr5[16];
                getactivenotifications.ShareDataUIState ^= iArr5[17];
                int i19 = getactivenotifications.ShareDataUIState;
                int i20 = getactivenotifications.component2;
                cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
                cArr[1] = (char) getactivenotifications.ShareDataUIState;
                cArr[2] = (char) (getactivenotifications.component2 >>> 16);
                cArr[3] = (char) getactivenotifications.component2;
                getActiveNotifications.component2(iArr5);
                cArr2[getactivenotifications.component1 * 2] = cArr[0];
                cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
                cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
                cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
                Object[] objArr6 = {getactivenotifications, getactivenotifications};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
                if (objCopydefault5 == null) {
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2944;
                    int i21 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 24;
                    char cArgb = (char) (Color.argb(0, 0, 0, 0) + 27637);
                    byte length4 = (byte) $$c.length;
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(minimumFlingVelocity, i21, cArgb, -1616366948, false, $$g((byte) 0, length4, (byte) (length4 - 3)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
                i2 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        /* JADX WARN: Code restructure failed: missing block: B:117:0x0711, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:118:0x0712, code lost:
        
            r1 = r0.getCause();
         */
        /* JADX WARN: Code restructure failed: missing block: B:119:0x0716, code lost:
        
            if (r1 != null) goto L120;
         */
        /* JADX WARN: Code restructure failed: missing block: B:120:0x0718, code lost:
        
            throw r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:121:0x0719, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x02bb, code lost:
        
            r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x02c2, code lost:
        
            if (r1 != null) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x02c4, code lost:
        
            r1 = android.graphics.Color.argb(r7, r7, r7, r7) + 1342;
            r23 = 'Q' - android.text.AndroidCharacter.getMirror('0');
            r3 = (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)) + 6424);
            r8 = (byte) 0;
            r9 = (byte) (r8 + 1);
            r13 = new java.lang.Object[1];
            b(r8, r9, r9, r13);
            r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r1, r23, r3, 1443979249, false, (java.lang.String) r13[0], null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x02fe, code lost:
        
            ((java.lang.reflect.Field) r1).set(null, r6);
            r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x030b, code lost:
        
            if (r1 != null) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x030d, code lost:
        
            r1 = android.view.KeyEvent.normalizeMetaState(0) + 1342;
            r23 = 33 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            r6 = (char) ((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 6425);
            r7 = (byte) 0;
            r8 = (byte) (r7 + 1);
            r12 = new java.lang.Object[1];
            b(r7, r8, r8, r12);
            r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r1, r23, r6, 1443979249, false, (java.lang.String) r12[0], null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0350, code lost:
        
            r6 = new java.lang.Object[]{0L, ((java.lang.reflect.Field) r1).get(null)};
            r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(812318566);
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0365, code lost:
        
            if (r1 != null) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0367, code lost:
        
            r1 = (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)) + 1341;
            r23 = 33 - android.view.KeyEvent.getDeadChar(0, 0);
            r3 = (char) (6425 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16));
            r8 = (byte) 3;
            r7 = (byte) (r8 - 1);
            r12 = new java.lang.Object[1];
            b(r8, r7, (byte) (r7 - 2), r12);
            r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r1, r23, r3, -181198845, false, (java.lang.String) r12[0], new java.lang.Class[]{java.lang.Long.TYPE, java.lang.reflect.Method.class});
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x03b1, code lost:
        
            ((java.lang.Long) ((java.lang.reflect.Method) r1).invoke(null, r6)).longValue();
         */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0298 A[PHI: r7
  0x0298: PHI (r7v59 int) = (r7v58 int), (r7v73 int) binds: [B:41:0x0296, B:38:0x028a] A[DONT_GENERATE, DONT_INLINE]] */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String encrypt(java.lang.String r30) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 2066
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.baselibs2.utils.encrypt.EncryptManager.copydefault.encrypt(java.lang.String):java.lang.String");
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x02ab A[Catch: Exception -> 0x06ee, TryCatch #1 {Exception -> 0x06ee, blocks: (B:3:0x0007, B:8:0x002d, B:16:0x003b, B:18:0x0086, B:19:0x00b6, B:23:0x00cb, B:25:0x00f0, B:69:0x03b5, B:31:0x019a, B:34:0x01e5, B:38:0x0236, B:40:0x023a, B:45:0x0255, B:51:0x02a2, B:53:0x02ab, B:54:0x02e7, B:56:0x02f6, B:57:0x032e, B:65:0x03ad, B:67:0x03b3, B:68:0x03b4, B:48:0x0279, B:71:0x03c2, B:73:0x03c8, B:74:0x03c9, B:75:0x03ca, B:77:0x03d3, B:78:0x0410, B:89:0x04dd, B:137:0x06cd, B:142:0x06dd, B:144:0x06e3, B:145:0x06e4, B:147:0x06e6, B:149:0x06ec, B:150:0x06ed, B:9:0x0032, B:10:0x0035, B:27:0x00f3, B:33:0x01a8, B:37:0x01f7, B:79:0x0417, B:81:0x0424, B:82:0x0464, B:84:0x046b, B:86:0x0483, B:87:0x04cc, B:59:0x0336, B:61:0x034d, B:62:0x0395), top: B:156:0x0007, inners: #0, #3, #7, #8 }] */
        /* JADX WARN: Removed duplicated region for block: B:56:0x02f6 A[Catch: Exception -> 0x06ee, TryCatch #1 {Exception -> 0x06ee, blocks: (B:3:0x0007, B:8:0x002d, B:16:0x003b, B:18:0x0086, B:19:0x00b6, B:23:0x00cb, B:25:0x00f0, B:69:0x03b5, B:31:0x019a, B:34:0x01e5, B:38:0x0236, B:40:0x023a, B:45:0x0255, B:51:0x02a2, B:53:0x02ab, B:54:0x02e7, B:56:0x02f6, B:57:0x032e, B:65:0x03ad, B:67:0x03b3, B:68:0x03b4, B:48:0x0279, B:71:0x03c2, B:73:0x03c8, B:74:0x03c9, B:75:0x03ca, B:77:0x03d3, B:78:0x0410, B:89:0x04dd, B:137:0x06cd, B:142:0x06dd, B:144:0x06e3, B:145:0x06e4, B:147:0x06e6, B:149:0x06ec, B:150:0x06ed, B:9:0x0032, B:10:0x0035, B:27:0x00f3, B:33:0x01a8, B:37:0x01f7, B:79:0x0417, B:81:0x0424, B:82:0x0464, B:84:0x046b, B:86:0x0483, B:87:0x04cc, B:59:0x0336, B:61:0x034d, B:62:0x0395), top: B:156:0x0007, inners: #0, #3, #7, #8 }] */
        /* JADX WARN: Removed duplicated region for block: B:61:0x034d A[Catch: all -> 0x03ac, TryCatch #8 {all -> 0x03ac, blocks: (B:59:0x0336, B:61:0x034d, B:62:0x0395), top: B:168:0x0336, outer: #1 }] */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String decrypt(java.lang.String r30) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 2032
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.baselibs2.utils.encrypt.EncryptManager.copydefault.decrypt(java.lang.String):java.lang.String");
        }

        /* JADX WARN: Code restructure failed: missing block: B:46:0x02fc, code lost:
        
            r0 = com.huawei.baselibs2.utils.encrypt.EncryptManager.copydefault.component3 + 91;
            com.huawei.baselibs2.utils.encrypt.EncryptManager.copydefault.component1 = r0 % 128;
            r0 = r0 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0309, code lost:
        
            r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x030d, code lost:
        
            if (r0 != null) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x030f, code lost:
        
            r0 = ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 1342;
            r21 = android.text.TextUtils.getOffsetAfter("", 0) + 33;
            r4 = (char) (6425 - android.text.TextUtils.getOffsetAfter("", 0));
            r6 = (byte) 0;
            r9 = (byte) (r6 + 1);
            r11 = new java.lang.Object[1];
            b(r6, r9, r9, r11);
            r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r0, r21, r4, 1443979249, false, (java.lang.String) r11[0], null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0346, code lost:
        
            ((java.lang.reflect.Field) r0).set(null, r13);
            r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0353, code lost:
        
            if (r0 != null) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0355, code lost:
        
            r9 = android.graphics.Color.green(0) + 1342;
            r10 = 33 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
            r11 = (char) (android.graphics.Color.alpha(0) + 6425);
            r0 = (byte) 0;
            r4 = (byte) (r0 + 1);
            r14 = new java.lang.Object[1];
            b(r0, r4, r4, r14);
            r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r9, r10, r11, 1443979249, false, (java.lang.String) r14[0], null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x038b, code lost:
        
            r4 = new java.lang.Object[]{0L, ((java.lang.reflect.Field) r0).get(null)};
            r6 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(812318566);
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x039f, code lost:
        
            if (r6 != null) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x03a1, code lost:
        
            r6 = 1342 - android.widget.ExpandableListView.getPackedPositionGroup(0);
            r21 = (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)) + 34;
            r0 = (char) (android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 6425);
            r9 = (byte) 3;
            r1 = (byte) (r9 - 1);
            r11 = new java.lang.Object[1];
            b(r9, r1, (byte) (r1 - 2), r11);
            r6 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r6, r21, r0, -181198845, false, (java.lang.String) r11[0], new java.lang.Class[]{java.lang.Long.TYPE, java.lang.reflect.Method.class});
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x03e4, code lost:
        
            ((java.lang.Long) ((java.lang.reflect.Method) r6).invoke(null, r4)).longValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x03f1, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x03f2, code lost:
        
            r1 = r0.getCause();
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x03f6, code lost:
        
            if (r1 != null) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x03f8, code lost:
        
            throw r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x03f9, code lost:
        
            throw r0;
         */
        /* JADX WARN: Removed duplicated region for block: B:108:0x05e8 A[Catch: Exception -> 0x070f, PHI: r0
  0x05e8: PHI (r0v65 java.lang.reflect.Method) = (r0v64 java.lang.reflect.Method), (r0v67 java.lang.reflect.Method) binds: [B:107:0x05e6, B:101:0x05de] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {Exception -> 0x070f, blocks: (B:3:0x0004, B:6:0x0015, B:7:0x004f, B:9:0x00bc, B:10:0x00ee, B:12:0x00f9, B:14:0x0120, B:20:0x01d1, B:24:0x021e, B:33:0x0278, B:40:0x02c6, B:42:0x02ca, B:44:0x02d5, B:47:0x0309, B:49:0x030f, B:50:0x0346, B:52:0x0355, B:53:0x0383, B:61:0x03f2, B:63:0x03f8, B:64:0x03f9, B:28:0x0263, B:65:0x03fa, B:67:0x0405, B:69:0x040b, B:70:0x040c, B:71:0x040d, B:73:0x0416, B:74:0x0445, B:85:0x0501, B:98:0x05d8, B:100:0x05dd, B:108:0x05e8, B:111:0x05f8, B:124:0x06da, B:125:0x06e3, B:127:0x06e5, B:129:0x06eb, B:130:0x06ec, B:132:0x06ee, B:134:0x06f4, B:135:0x06f5, B:136:0x06f6, B:106:0x05e4, B:139:0x06fe, B:141:0x0704, B:142:0x0705, B:144:0x0707, B:146:0x070d, B:147:0x070e, B:55:0x038b, B:57:0x03a1, B:58:0x03e4, B:120:0x0663, B:122:0x0695, B:123:0x06d5, B:16:0x012b, B:18:0x0173, B:23:0x01df, B:39:0x0285, B:27:0x0225, B:75:0x044c, B:77:0x0459, B:78:0x0492, B:115:0x062c, B:117:0x0632, B:118:0x065b, B:80:0x0499, B:82:0x04b0, B:83:0x04f0), top: B:155:0x0004, inners: #1, #3, #4, #5, #7, #8 }] */
        /* JADX WARN: Removed duplicated region for block: B:110:0x05f7  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0269  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x05c6  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final javax.crypto.Cipher component2() throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 2086
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.baselibs2.utils.encrypt.EncryptManager.copydefault.component2():javax.crypto.Cipher");
        }
    }
}
