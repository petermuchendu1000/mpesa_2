package com.huawei.digitalpayment.consumer.baselib.util.encrypt.random;

import android.os.Build;
import com.google.android.gms.common.util.zzc$$ExternalSyntheticApiModelOutline0;
import com.huawei.common.util.L;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.Security;
import kotlin.createNewMenuItem;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.prng.SP800SecureRandom;
import org.bouncycastle.crypto.prng.SP800SecureRandomBuilder;

public final class SecurityRandomUtil {
    private static int ShareDataUIState = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    static {
        Security.addProvider(new HRIProvider());
        int i = copydefault + 91;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            int i2 = 45 / 0;
        }
    }

    private SecurityRandomUtil() {
    }

    public static SecureRandom genSecureRandom() {
        SecureRandom secureRandomDrbg;
        int i = 2 % 2;
        int i2 = component2 + 103;
        component3 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                secureRandomDrbg = drbg();
                int i3 = 22 / 0;
            } else {
                secureRandomDrbg = drbg();
            }
            int i4 = component3 + 121;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                return secureRandomDrbg;
            }
            throw null;
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static SecureRandom drbg() throws NoSuchAlgorithmException {
        int i = 2 % 2;
        int i2 = component3 + 35;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        if (Build.VERSION.SDK_INT < 26) {
            SecureRandom secureRandomShareDataUIState = copydefault.ShareDataUIState();
            if (secureRandomShareDataUIState == null) {
                throw new NoSuchAlgorithmException();
            }
            int i4 = component3 + 85;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                return secureRandomShareDataUIState;
            }
            throw null;
        }
        int i5 = component2 + 97;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return zzc$$ExternalSyntheticApiModelOutline0.m9779m();
    }

    static class copydefault {
        private static int ShareDataUIState = 0;
        private static final SecureRandom component1;
        private static int component2 = 0;
        private static int component3 = 1;
        private static int copydefault = 1;

        static {
            SecureRandom secureRandomComponent1;
            try {
                secureRandomComponent1 = component1();
                int i = component2 + 71;
                copydefault = i % 128;
                if (i % 2 != 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchAlgorithmException unused) {
                L.d("drbg error");
                secureRandomComponent1 = null;
            }
            component1 = secureRandomComponent1;
            int i3 = component2 + 93;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
        }

        private copydefault() {
        }

        private static SecureRandom component1() throws NoSuchAlgorithmException {
            int i = 2 % 2;
            SecureRandom secureRandom = SecureRandom.getInstance("DevRandomSeed");
            SP800SecureRandom sP800SecureRandomBuildCTR = new SP800SecureRandomBuilder(secureRandom, true).setEntropyBitsRequired(createNewMenuItem.copydefault).buildCTR(new AESEngine(), 256, secureRandom.generateSeed(32), false);
            int i2 = component3 + 119;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return sP800SecureRandomBuildCTR;
        }

        static SecureRandom ShareDataUIState() {
            int i = 2 % 2;
            int i2 = component3 + 83;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return component1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
