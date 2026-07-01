package com.huawei.biometric;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;
import com.google.android.gms.stats.CodePackage;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_User;
import com.huawei.common.util.HexUtils;
import com.huawei.common.util.L;
import com.huawei.common.util.encrypt.AESEncryptConfigure;
import java.lang.reflect.Method;
import java.security.Key;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.ITrustedWebActivityCallbackDefault;

public class CipherUtils {
    private static final String component3 = "CipherUtils";

    @Deprecated
    public static boolean biometricChanged(String str, boolean z) {
        try {
            Cipher cipherLoadNoInitCipher = loadNoInitCipher(str, z);
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            Key key = keyStore.getKey(str, null);
            if (cipherLoadNoInitCipher != null) {
                cipherLoadNoInitCipher.init(1, key);
            }
            return false;
        } catch (KeyPermanentlyInvalidatedException e) {
            L.e(component3, "biometricChanged: " + e.getMessage());
            return true;
        } catch (Exception e2) {
            L.e(component3, "biometricChanged: " + e2.getMessage());
            return false;
        }
    }

    public static void removeKey(String str) {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            keyStore.deleteEntry(str);
        } catch (Exception e) {
            L.e(e.getMessage());
        }
    }

    public static Cipher loadEncryptCipher(String str, boolean z) {
        return loadEncryptCipher(str, z, true);
    }

    public static Cipher loadEncryptCipher(String str, boolean z, boolean z2) {
        Cipher cipherLoadNoInitCipher = loadNoInitCipher(str, z);
        if (cipherLoadNoInitCipher != null) {
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                cipherLoadNoInitCipher.init(1, keyStore.getKey(str, null));
                return cipherLoadNoInitCipher;
            } catch (KeyPermanentlyInvalidatedException e) {
                L.e(component3, "biometricChanged: KeyPermanentlyInvalidatedException " + e.getMessage());
                removeKey(str);
                if (z2) {
                    return loadEncryptCipher(str, z, false);
                }
            } catch (Exception e2) {
                L.e(component3, "loadEncryptCipher: " + e2.getMessage());
            }
        }
        return null;
    }

    public static Cipher loadDecryptCipher(String str, boolean z, String str2) {
        Cipher cipherLoadNoInitCipher = loadNoInitCipher(str, z);
        if (cipherLoadNoInitCipher != null) {
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                cipherLoadNoInitCipher.init(2, keyStore.getKey(str, null), new GCMParameterSpec(128, HexUtils.hexStringToByteArray(str2)));
                return cipherLoadNoInitCipher;
            } catch (Exception e) {
                L.e(component3, "loadDecryptCipher: " + e.getMessage());
            }
        }
        return null;
    }

    public static Cipher loadNoInitCipher(String str, boolean z) {
        KeyStore keyStore;
        try {
            KeyStore keyStore2 = KeyStore.getInstance("AndroidKeyStore");
            int length = str != null ? str.length() : 0;
            ArrayList arrayList = new ArrayList();
            int iShareDataUIState = AutoValue_CrashlyticsReport_Session_User.Builder.ShareDataUIState(arrayList);
            int i = iShareDataUIState ^ length;
            if (iShareDataUIState != 0) {
                long j = -1;
                long j2 = 0;
                long j3 = (((j - ((j >> 63) << 32)) | (((long) 0) << 32)) & ((long) (length ^ i))) | (((long) 1) << 32) | (j2 - ((j2 >> 63) << 32));
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6617 - MotionEvent.axisFromString(""), TextUtils.getOffsetAfter("", 0) + 42, (char) Drawable.resolveOpacity(0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    try {
                        Object[] objArr = {-667089590, Long.valueOf(j3), arrayList, null, false, false};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                        if (objCopydefault2 == null) {
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - Gravity.getAbsoluteGravity(0, 0), 56 - View.getDefaultSize(0, 0), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                        }
                        ((Method) objCopydefault2).invoke(objInvoke, objArr);
                        int[] iArr = new int[length];
                        int i2 = length - 1;
                        iArr[i2] = 1;
                        Toast.makeText((Context) null, iArr[((length * i2) % 2) - 1], 1).show();
                        keyStore = keyStore2;
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
            } else {
                keyStore = keyStore2;
            }
            keyStore.load(null);
            if (!keyStore.containsAlias(str)) {
                KeyGenerator keyGenerator = KeyGenerator.getInstance(AESEncryptConfigure.AES, "AndroidKeyStore");
                KeyGenParameterSpec.Builder encryptionPaddings = new KeyGenParameterSpec.Builder(str, 3).setBlockModes(CodePackage.GCM).setUserAuthenticationRequired(z).setEncryptionPaddings("NoPadding");
                encryptionPaddings.setInvalidatedByBiometricEnrollment(true);
                keyGenerator.init(encryptionPaddings.build());
                keyGenerator.generateKey();
            }
            return Cipher.getInstance(AESEncryptConfigure.AES_ALGORITHM);
        } catch (Exception unused) {
            Log.d(component3, "loadNoInitCipher: ");
            return null;
        }
    }
}
