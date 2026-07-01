package com.huawei.common.util.encrypt;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import com.huawei.common.util.HexUtils;
import com.huawei.common.util.L;
import com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.newspaper.NewsPaperNavigationKt$$ExternalSyntheticLambda1;
import com.huawei.digitalpayment.consumer.sfcui.postpay.manage.changeplan.OtherPostpayPlansScreenKt$$ExternalSyntheticLambda0;
import java.lang.reflect.Method;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.text.Charsets;

public class EncryptUtils {
    public static final String RSA_SHA256 = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding";
    private static final String component1 = "EncryptUtils2";
    private static final int copydefault = 32;

    private EncryptUtils() {
    }

    public static String createRandomDynamicIv() {
        return createRandomDynamicIv(32);
    }

    public static String createRandomDynamicIv(int i) {
        if (i <= 0) {
            return "";
        }
        byte[] bArr = new byte[i];
        SecureRandom secureRandomGenSecureRandom = SecurityRandomUtil.genSecureRandom();
        if (secureRandomGenSecureRandom != null) {
            secureRandomGenSecureRandom.nextBytes(bArr);
        }
        return HexUtils.bytesToHex(bArr).toLowerCase(Locale.ENGLISH);
    }

    public static String rsaEncrypt(String str, String str2, String str3) {
        return rsaEncrypt(getPublicKey(str), str3, str2);
    }

    public static String rsaEncrypt(PublicKey publicKey, String str, String str2) throws Throwable {
        int length;
        if (publicKey == null) {
            return "";
        }
        if (str != null) {
            try {
                length = str.length();
            } catch (InvalidAlgorithmParameterException e) {
                L.e(component1, e.getMessage());
                return "";
            } catch (InvalidKeyException e2) {
                L.e(component1, e2.getMessage());
                return "";
            } catch (NoSuchAlgorithmException e3) {
                L.e(component1, e3.getMessage());
                return "";
            } catch (BadPaddingException e4) {
                L.e(component1, e4.getMessage());
                return "";
            } catch (IllegalBlockSizeException e5) {
                L.e(component1, e5.getMessage());
                return "";
            } catch (NoSuchPaddingException e6) {
                L.e(component1, e6.getMessage());
                return "";
            }
        } else {
            length = 0;
        }
        ArrayList arrayList = new ArrayList();
        int iComponent1 = OtherPostpayPlansScreenKt$$ExternalSyntheticLambda0.component1(arrayList);
        int i = iComponent1 ^ length;
        if (iComponent1 != 0) {
            int i2 = length;
            long j = -1;
            long j2 = 0;
            long j3 = (((j - ((j >> 63) << 32)) | (((long) 0) << 32)) & ((long) (length ^ i))) | (((long) 1) << 32) | (j2 - ((j2 >> 63) << 32));
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 6617, 42 - View.combineMeasuredStates(0, 0), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                try {
                    Object[] objArr = {1204500707, Long.valueOf(j3), arrayList, null, false, false};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 56, (char) KeyEvent.normalizeMetaState(0), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr);
                    Toast.makeText((Context) null, i2 / (((i2 - 1) * i2) % 2), 0).show();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }
        Cipher cipher = Cipher.getInstance(str2);
        if (cipher == null) {
            return "";
        }
        if ("RSA/ECB/OAEPWithSHA-256AndMGF1Padding".equals(str2)) {
            cipher.init(1, publicKey, new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA1, PSource.PSpecified.DEFAULT));
        } else {
            cipher.init(1, publicKey);
        }
        int length2 = str != null ? str.length() : 0;
        ArrayList arrayList2 = new ArrayList();
        int iComponent3 = NewsPaperNavigationKt$$ExternalSyntheticLambda1.component3(arrayList2);
        int i3 = iComponent3 ^ length2;
        if (iComponent3 != 0) {
            long j4 = -1;
            long j5 = 0;
            long j6 = (((long) (length2 ^ i3)) & ((((long) 0) << 32) | (j4 - ((j4 >> 63) << 32)))) | (((long) 1) << 32) | (j5 - ((j5 >> 63) << 32));
            try {
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(6619 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), ImageFormat.getBitsPerPixel(0) + 43, (char) TextUtils.indexOf("", ""), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke2 = ((Method) objCopydefault3).invoke(null, null);
                try {
                    Object[] objArr2 = {-891715930, Long.valueOf(j6), arrayList2, null, false, false};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                    if (objCopydefault4 == null) {
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0') + 6563, (ViewConfiguration.getLongPressTimeout() >> 16) + 56, (char) Color.argb(0, 0, 0, 0), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                    }
                    ((Method) objCopydefault4).invoke(objInvoke2, objArr2);
                    int[] iArr = new int[length2];
                    int i4 = length2 - 1;
                    iArr[i4] = 1;
                    Toast.makeText((Context) null, iArr[((length2 * i4) % 2) - 1], 1).show();
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 != null) {
                        throw cause3;
                    }
                    throw th3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 != null) {
                    throw cause4;
                }
                throw th4;
            }
        }
        return Base64.encodeToString(cipher.doFinal(str.getBytes(Charsets.UTF_8)), 2);
    }

    public static PublicKey getPublicKey(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
        } catch (Exception e) {
            L.e(component1, e.getMessage());
            return null;
        }
    }
}
