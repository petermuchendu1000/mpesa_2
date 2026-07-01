package com.huawei.digitalpayment.consumer.baselib.util.encrypt.random;

import androidx.exifinterface.media.ExifInterface;
import java.security.Provider;

public final class HRIProvider extends Provider {
    private static final long serialVersionUID = 253423509590484384L;

    protected HRIProvider() {
        super("HRI", 1.0d, "HRI crypto");
        put("SecureRandom.DevRandomSeed", DevRandomSeed.class.getCanonicalName());
        put("SecureRandom.DevRandomSeed ImplementedIn", ExifInterface.TAG_SOFTWARE);
    }
}
