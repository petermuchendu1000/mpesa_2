package com.safaricom.aipay.scantopay.sdk.core;

import com.example.aipay.scantopay.sdk.core.internal.b;
import com.iap.ac.config.lite.ConfigMerger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/safaricom/aipay/scantopay/sdk/core/ScanToPayCore;", "", "<init>", "()V", "configuration", "Lcom/safaricom/aipay/scantopay/sdk/core/SdkConfiguration;", "initialize", "", ConfigMerger.COMMON_CONFIG_SECTION, "getConfiguration", "scan-to-pay-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScanToPayCore {
    public static final ScanToPayCore INSTANCE = new ScanToPayCore();
    private static SdkConfiguration configuration;

    private ScanToPayCore() {
    }

    public final SdkConfiguration getConfiguration() {
        SdkConfiguration sdkConfiguration = configuration;
        return sdkConfiguration == null ? new SdkConfiguration(null, null, null, 7, null) : sdkConfiguration;
    }

    public final void initialize(SdkConfiguration config) {
        Intrinsics.checkNotNullParameter(config, "");
        configuration = config;
        String allowedSignatureHash = config.getAllowedSignatureHash();
        if (allowedSignatureHash != null) {
            b.a(allowedSignatureHash);
        }
    }
}
