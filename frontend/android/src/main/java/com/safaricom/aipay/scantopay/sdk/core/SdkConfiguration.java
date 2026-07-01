package com.safaricom.aipay.scantopay.sdk.core;

import com.alibaba.griver.api.resource.appcenter.storage.AppInfoDao;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0018B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/safaricom/aipay/scantopay/sdk/core/SdkConfiguration;", "", "allowedSignatureHash", "", "authToken", AppInfoDao.COLUMN_ENVIRONMENT, "Lcom/safaricom/aipay/scantopay/sdk/core/SdkConfiguration$Environment;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/safaricom/aipay/scantopay/sdk/core/SdkConfiguration$Environment;)V", "getAllowedSignatureHash", "()Ljava/lang/String;", "getAuthToken", "getEnvironment", "()Lcom/safaricom/aipay/scantopay/sdk/core/SdkConfiguration$Environment;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Environment", "scan-to-pay-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SdkConfiguration {
    private final String allowedSignatureHash;
    private final String authToken;
    private final Environment environment;

    public SdkConfiguration() {
        this(null, null, null, 7, null);
    }

    public final String getAllowedSignatureHash() {
        return this.allowedSignatureHash;
    }

    public final String getAuthToken() {
        return this.authToken;
    }

    public final Environment getEnvironment() {
        return this.environment;
    }

    public SdkConfiguration(String str, String str2, Environment environment) {
        Intrinsics.checkNotNullParameter(environment, "");
        this.allowedSignatureHash = str;
        this.authToken = str2;
        this.environment = environment;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/safaricom/aipay/scantopay/sdk/core/SdkConfiguration$Environment;", "", "<init>", "(Ljava/lang/String;I)V", "SANDBOX", "PRODUCTION", "scan-to-pay-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Environment {
        private static final EnumEntries $ENTRIES;
        private static final Environment[] $VALUES;
        public static final Environment SANDBOX = new Environment("SANDBOX", 0);
        public static final Environment PRODUCTION = new Environment("PRODUCTION", 1);

        static {
            Environment[] environmentArr$values = $values();
            $VALUES = environmentArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(environmentArr$values);
        }

        private Environment(String str, int i) {
        }

        public static Environment valueOf(String str) {
            return (Environment) Enum.valueOf(Environment.class, str);
        }

        public static Environment[] values() {
            return (Environment[]) $VALUES.clone();
        }

        private static final Environment[] $values() {
            return new Environment[]{SANDBOX, PRODUCTION};
        }

        public static EnumEntries<Environment> getEntries() {
            return $ENTRIES;
        }
    }

    public SdkConfiguration(String str, String str2, Environment environment, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? Environment.PRODUCTION : environment);
    }

    public static SdkConfiguration copy$default(SdkConfiguration sdkConfiguration, String str, String str2, Environment environment, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sdkConfiguration.allowedSignatureHash;
        }
        if ((i & 2) != 0) {
            str2 = sdkConfiguration.authToken;
        }
        if ((i & 4) != 0) {
            environment = sdkConfiguration.environment;
        }
        return sdkConfiguration.copy(str, str2, environment);
    }

    public final String getAllowedSignatureHash() {
        return this.allowedSignatureHash;
    }

    public final String getAuthToken() {
        return this.authToken;
    }

    public final Environment getEnvironment() {
        return this.environment;
    }

    public final SdkConfiguration copy(String allowedSignatureHash, String authToken, Environment environment) {
        Intrinsics.checkNotNullParameter(environment, "");
        return new SdkConfiguration(allowedSignatureHash, authToken, environment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SdkConfiguration)) {
            return false;
        }
        SdkConfiguration sdkConfiguration = (SdkConfiguration) other;
        return Intrinsics.areEqual(this.allowedSignatureHash, sdkConfiguration.allowedSignatureHash) && Intrinsics.areEqual(this.authToken, sdkConfiguration.authToken) && this.environment == sdkConfiguration.environment;
    }

    public int hashCode() {
        String str = this.allowedSignatureHash;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.authToken;
        return this.environment.hashCode() + (((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "SdkConfiguration(allowedSignatureHash=" + this.allowedSignatureHash + ", authToken=" + this.authToken + ", environment=" + this.environment + ")";
    }
}
