package com.huawei.digitalpayment.home.theme.data.local;

import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/home/theme/data/local/LocalBannerComponent;", "Lcom/huawei/http/BaseResp;", "url", "", "text", KeysConstants.KEY_EXECUTE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getText", "getExecute", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LocalBannerComponent extends BaseResp {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    private final String execute;
    private final String text;
    private final String url;

    /* JADX WARN: Illegal instructions before constructor call */
    public LocalBannerComponent(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i3 = ShareDataUIState + 115;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            str2 = null;
        }
        if ((i & 4) != 0) {
            int i5 = copydefault + 103;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str3 = null;
        }
        this(str, str2, str3);
    }

    public final String getUrl() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 41;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.url;
        int i5 = i2 + 45;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getText() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 105;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.text;
        int i5 = i3 + 61;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 59 / 0;
        }
        return str;
    }

    public final String getExecute() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 97;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.execute;
            int i4 = 88 / 0;
        } else {
            str = this.execute;
        }
        int i5 = i2 + 37;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 78 / 0;
        }
        return str;
    }

    public LocalBannerComponent(String str, String str2, String str3) {
        this.url = str;
        this.text = str2;
        this.execute = str3;
    }

    public LocalBannerComponent() {
        this(null, null, null, 7, null);
    }

    public static LocalBannerComponent copy$default(LocalBannerComponent localBannerComponent, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault + 71;
        int i4 = i3 % 128;
        ShareDataUIState = i4;
        if (i3 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            str = localBannerComponent.url;
        }
        if ((i & 2) != 0) {
            int i5 = i4 + 73;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                String str4 = localBannerComponent.text;
                throw null;
            }
            str2 = localBannerComponent.text;
        }
        if ((i & 4) != 0) {
            str3 = localBannerComponent.execute;
        }
        return localBannerComponent.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 21;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.url;
        int i5 = i2 + 17;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 109;
        int i3 = i2 % 128;
        copydefault = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.text;
        int i4 = i3 + 121;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 11;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.execute;
        int i5 = i2 + 103;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final LocalBannerComponent copy(String url, String text, String execute) {
        int i = 2 % 2;
        LocalBannerComponent localBannerComponent = new LocalBannerComponent(url, text, execute);
        int i2 = ShareDataUIState + 87;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return localBannerComponent;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalBannerComponent)) {
            int i2 = ShareDataUIState + 1;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 121;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        LocalBannerComponent localBannerComponent = (LocalBannerComponent) other;
        if (!Intrinsics.areEqual(this.url, localBannerComponent.url)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.text, localBannerComponent.text)) {
            int i7 = copydefault + 91;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.execute, localBannerComponent.execute)) {
            return true;
        }
        int i9 = copydefault + 49;
        ShareDataUIState = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.url;
        if (str == null) {
            int i2 = copydefault + 53;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.text;
        if (str2 == null) {
            int i4 = copydefault + 5;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 / 4;
            }
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.execute;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LocalBannerComponent(url=" + this.url + ", text=" + this.text + ", execute=" + this.execute + ")";
        int i2 = ShareDataUIState + 49;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
