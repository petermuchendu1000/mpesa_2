package com.huawei.digitalpayment.home.theme.data.remote;

import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/home/theme/data/remote/RemoteBannerComponent;", "Lcom/huawei/http/BaseResp;", "url", "", "text", KeysConstants.KEY_EXECUTE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getText", "getExecute", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RemoteBannerComponent extends BaseResp {
    private static int component2 = 0;
    private static int copydefault = 1;
    private final String execute;
    private final String text;
    private final String url;

    /* JADX WARN: Illegal instructions before constructor call */
    public RemoteBannerComponent(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i & 1) != 0 ? null : str;
        if ((i & 2) != 0) {
            int i2 = copydefault + 23;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i3 = 2 % 2;
            str2 = null;
        }
        if ((i & 4) != 0) {
            int i4 = component2 + 5;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 / 5;
            } else {
                int i6 = 2 % 2;
            }
            str3 = null;
        }
        this(str, str2, str3);
    }

    public final String getUrl() {
        int i = 2 % 2;
        int i2 = copydefault + 11;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.url;
        }
        throw null;
    }

    public final String getText() {
        int i = 2 % 2;
        int i2 = copydefault + 55;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.text;
        int i5 = i3 + 91;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getExecute() {
        int i = 2 % 2;
        int i2 = copydefault + 31;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.execute;
        int i5 = i3 + 7;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public RemoteBannerComponent(String str, String str2, String str3) {
        this.url = str;
        this.text = str2;
        this.execute = str3;
    }

    public RemoteBannerComponent() {
        this(null, null, null, 7, null);
    }

    public static RemoteBannerComponent copy$default(RemoteBannerComponent remoteBannerComponent, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component2 + 67;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            str = remoteBannerComponent.url;
        }
        if ((i & 2) != 0) {
            str2 = remoteBannerComponent.text;
        }
        if ((i & 4) != 0) {
            int i5 = copydefault + 93;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                String str4 = remoteBannerComponent.execute;
                throw null;
            }
            str3 = remoteBannerComponent.execute;
        }
        RemoteBannerComponent remoteBannerComponentCopy = remoteBannerComponent.copy(str, str2, str3);
        int i6 = component2 + 1;
        copydefault = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 70 / 0;
        }
        return remoteBannerComponentCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 45;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.url;
        int i5 = i2 + 71;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 41;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.text;
        int i5 = i2 + 121;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault + 91;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            str = this.execute;
            int i4 = 95 / 0;
        } else {
            str = this.execute;
        }
        int i5 = i3 + 93;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final RemoteBannerComponent copy(String url, String text, String execute) {
        int i = 2 % 2;
        RemoteBannerComponent remoteBannerComponent = new RemoteBannerComponent(url, text, execute);
        int i2 = component2 + 101;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 78 / 0;
        }
        return remoteBannerComponent;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copydefault + 63;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (other instanceof RemoteBannerComponent) {
            RemoteBannerComponent remoteBannerComponent = (RemoteBannerComponent) other;
            return (!Intrinsics.areEqual(this.url, remoteBannerComponent.url) || (Intrinsics.areEqual(this.text, remoteBannerComponent.text) ^ true) || (Intrinsics.areEqual(this.execute, remoteBannerComponent.execute) ^ true)) ? false : true;
        }
        int i4 = component2 + 41;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.url;
        int iHashCode2 = 0;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.text;
        if (str2 == null) {
            int i2 = component2 + 75;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        String str3 = this.execute;
        if (str3 != null) {
            iHashCode2 = str3.hashCode();
            int i4 = component2 + 33;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        }
        return (((iHashCode3 * 31) + iHashCode) * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RemoteBannerComponent(url=" + this.url + ", text=" + this.text + ", execute=" + this.execute + ")";
        int i2 = copydefault + 115;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
