package com.huawei.digitalpayment.consumer.basicUi.response.local;

import com.huawei.common.util.image.UrlUtils;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/huawei/digitalpayment/consumer/basicUi/response/local/LocalMutiLanguageConfig;", "Lcom/huawei/http/BaseResp;", "version", "", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getVersion", "()Ljava/lang/String;", "getUrl", "getFullUrl", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerBasicUiModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LocalMutiLanguageConfig extends BaseResp {
    private static int ShareDataUIState = 1;
    private static int component1;
    private final String url;
    private final String version;

    /* JADX WARN: Illegal instructions before constructor call */
    public LocalMutiLanguageConfig(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component1;
            int i3 = i2 + 17;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 15;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            str = null;
        }
        if ((i & 2) != 0) {
            int i7 = ShareDataUIState + 125;
            component1 = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 90 / 0;
            }
            str2 = null;
        }
        this(str, str2);
    }

    public final String getVersion() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 27;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.version;
        int i5 = i2 + 65;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getUrl() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 53;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.url;
        int i5 = i2 + 49;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public LocalMutiLanguageConfig(String str, String str2) {
        this.version = str;
        this.url = str2;
    }

    public final String getFullUrl() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String fullUrl = UrlUtils.getFullUrl(AppConfigManager.getAppConfig().getH5BaseUrl(), this.url);
        Intrinsics.checkNotNullExpressionValue(fullUrl, "");
        int i4 = ShareDataUIState + 27;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return fullUrl;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LocalMutiLanguageConfig() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static LocalMutiLanguageConfig copy$default(LocalMutiLanguageConfig localMutiLanguageConfig, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = localMutiLanguageConfig.version;
        }
        if ((i & 2) != 0) {
            int i3 = ShareDataUIState + 69;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                str2 = localMutiLanguageConfig.url;
                int i4 = 34 / 0;
            } else {
                str2 = localMutiLanguageConfig.url;
            }
        }
        LocalMutiLanguageConfig localMutiLanguageConfigCopy = localMutiLanguageConfig.copy(str, str2);
        int i5 = ShareDataUIState + 101;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return localMutiLanguageConfigCopy;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 93;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.version;
        int i5 = i2 + 63;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 17;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.url;
        int i5 = i2 + 65;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final LocalMutiLanguageConfig copy(String version, String url) {
        int i = 2 % 2;
        LocalMutiLanguageConfig localMutiLanguageConfig = new LocalMutiLanguageConfig(version, url);
        int i2 = ShareDataUIState + 57;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return localMutiLanguageConfig;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 5;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalMutiLanguageConfig)) {
            int i5 = i2 + 7;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        LocalMutiLanguageConfig localMutiLanguageConfig = (LocalMutiLanguageConfig) other;
        if (!(!Intrinsics.areEqual(this.version, localMutiLanguageConfig.version))) {
            return Intrinsics.areEqual(this.url, localMutiLanguageConfig.url);
        }
        int i7 = ShareDataUIState + 9;
        component1 = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 21;
        component1 = i2 % 128;
        int iHashCode = 0;
        int iHashCode2 = (i2 % 2 == 0 ? (str = this.version) != null : (str = this.version) != null) ? str.hashCode() : 0;
        String str2 = this.url;
        if (str2 == null) {
            int i3 = ShareDataUIState + 71;
            component1 = i3 % 128;
            int i4 = i3 % 2;
        } else {
            iHashCode = str2.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LocalMutiLanguageConfig(version=" + this.version + ", url=" + this.url + ")";
        int i2 = ShareDataUIState + 55;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
