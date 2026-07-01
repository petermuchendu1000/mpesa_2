package com.huawei.digitalpayment.consumer.sfcui.sharedata;

import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0018\u001a\u00020\u0019H×\u0001J\t\u0010\u001a\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/ShareableData;", "", GriverCacheDao.COLUMN_CACHE_ID, "", "balance", "type", "Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/ShareableDataType;", "updatedAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/ShareableDataType;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getBalance", "getType", "()Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/ShareableDataType;", "getUpdatedAt", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ShareableData {
    public static final int $stable = 0;
    private static int component2 = 0;
    private static int component4 = 1;
    private static int equals = 1;
    private static int getAsAtTimestamp;
    private final String ShareDataUIState;
    private final ShareableDataType component1;
    private final String component3;
    private final String copydefault;

    public ShareableData(String str, String str2, ShareableDataType shareableDataType, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(shareableDataType, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.component3 = str;
        this.ShareDataUIState = str2;
        this.component1 = shareableDataType;
        this.copydefault = str3;
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 75;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component3;
        int i5 = i2 + 53;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getBalance() {
        int i = 2 % 2;
        int i2 = component4 + 85;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ShareDataUIState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ShareableDataType getType() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 109;
        getAsAtTimestamp = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        ShareableDataType shareableDataType = this.component1;
        int i4 = i2 + 101;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            return shareableDataType;
        }
        obj.hashCode();
        throw null;
    }

    public final String getUpdatedAt() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 107;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copydefault;
        int i5 = i2 + 87;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = 1 + 57;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public static ShareableData copy$default(ShareableData shareableData, String str, String str2, ShareableDataType shareableDataType, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = getAsAtTimestamp + 9;
            component4 = i3 % 128;
            if (i3 % 2 == 0) {
                str = shareableData.component3;
                int i4 = 37 / 0;
            } else {
                str = shareableData.component3;
            }
        }
        if ((i & 2) != 0) {
            str2 = shareableData.ShareDataUIState;
        }
        if ((i & 4) != 0) {
            shareableDataType = shareableData.component1;
        }
        if ((i & 8) != 0) {
            str3 = shareableData.copydefault;
        }
        ShareableData shareableDataCopy = shareableData.copy(str, str2, shareableDataType, str3);
        int i5 = component4 + 115;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            return shareableDataCopy;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 73;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component3;
        int i5 = i2 + 89;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component4 + 57;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ShareDataUIState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ShareableDataType component3() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 113;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        ShareableDataType shareableDataType = this.component1;
        int i5 = i2 + 123;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return shareableDataType;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 57;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 103;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final ShareableData copy(String id, String balance, ShareableDataType type, String updatedAt) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(id, "");
        Intrinsics.checkNotNullParameter(balance, "");
        Intrinsics.checkNotNullParameter(type, "");
        Intrinsics.checkNotNullParameter(updatedAt, "");
        ShareableData shareableData = new ShareableData(id, balance, type, updatedAt);
        int i2 = getAsAtTimestamp + 7;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            return shareableData;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = getAsAtTimestamp + 39;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (other instanceof ShareableData) {
            ShareableData shareableData = (ShareableData) other;
            if (Intrinsics.areEqual(this.component3, shareableData.component3) && !(!Intrinsics.areEqual(this.ShareDataUIState, shareableData.ShareDataUIState))) {
                if (this.component1 != shareableData.component1) {
                    int i4 = getAsAtTimestamp + 99;
                    component4 = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
                if (Intrinsics.areEqual(this.copydefault, shareableData.copydefault)) {
                    return true;
                }
                int i6 = getAsAtTimestamp + 53;
                component4 = i6 % 128;
                return i6 % 2 == 0;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component4 + 77;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.component3.hashCode();
        return i3 != 0 ? (((((iHashCode / 19) + this.ShareDataUIState.hashCode()) >>> 19) - this.component1.hashCode()) + 5) - this.copydefault.hashCode() : (((((iHashCode * 31) + this.ShareDataUIState.hashCode()) * 31) + this.component1.hashCode()) * 31) + this.copydefault.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ShareableData(id=" + this.component3 + ", balance=" + this.ShareDataUIState + ", type=" + this.component1 + ", updatedAt=" + this.copydefault + ")";
        int i2 = component4 + 97;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
