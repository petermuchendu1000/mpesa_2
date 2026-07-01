package com.huawei.common.util.encrypt;

import android.os.Build;
import com.google.android.gms.common.util.zzc$$ExternalSyntheticApiModelOutline0;
import com.huawei.common.util.L;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.Security;
import kotlin.MainThread;
import kotlin.createNewMenuItem;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.prng.SP800SecureRandomBuilder;

public final class SecurityRandomUtil {
    static {
        Security.addProvider(new MainThread());
    }

    private SecurityRandomUtil() {
    }

    public static SecureRandom genSecureRandom() {
        try {
            return drbg();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static SecureRandom drbg() throws NoSuchAlgorithmException {
        if (Build.VERSION.SDK_INT >= 26) {
            return zzc$$ExternalSyntheticApiModelOutline0.m9779m();
        }
        SecureRandom secureRandom = component2.ShareDataUIState;
        if (secureRandom != null) {
            return secureRandom;
        }
        throw new NoSuchAlgorithmException();
    }

    static class component2 {
        private static final SecureRandom ShareDataUIState;

        static {
            SecureRandom secureRandomCopydefault;
            try {
                secureRandomCopydefault = copydefault();
            } catch (NoSuchAlgorithmException unused) {
                L.d("drbg error");
                secureRandomCopydefault = null;
            }
            ShareDataUIState = secureRandomCopydefault;
        }

        private component2() {
        }

        private static SecureRandom copydefault() throws NoSuchAlgorithmException {
            SecureRandom secureRandom = SecureRandom.getInstance("DevRandomSeed");
            return new SP800SecureRandomBuilder(secureRandom, true).setEntropyBitsRequired(createNewMenuItem.copydefault).buildCTR(new AESEngine(), 256, secureRandom.generateSeed(32), false);
        }
    }
}
