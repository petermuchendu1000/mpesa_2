package com.safaricom.consumer.commons.statements;

import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/safaricom/consumer/commons/statements/DisplayBean;", "", "key", "", "value", GriverCacheDao.COLUMN_CACHE_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getValue", "getId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DisplayBean {
    private final String ShareDataUIState;
    private final String component3;
    private final String copydefault;

    public DisplayBean(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.component3 = str;
        this.ShareDataUIState = str2;
        this.copydefault = str3;
    }

    public final String getKey() {
        return this.component3;
    }

    public final String getValue() {
        return this.ShareDataUIState;
    }

    public DisplayBean(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? "" : str3);
    }

    public final String getId() {
        return this.copydefault;
    }

    public static DisplayBean copy$default(DisplayBean displayBean, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = displayBean.component3;
        }
        if ((i & 2) != 0) {
            str2 = displayBean.ShareDataUIState;
        }
        if ((i & 4) != 0) {
            str3 = displayBean.copydefault;
        }
        return displayBean.copy(str, str2, str3);
    }

    public final String getComponent3() {
        return this.component3;
    }

    public final String getShareDataUIState() {
        return this.ShareDataUIState;
    }

    public final String getCopydefault() {
        return this.copydefault;
    }

    public final DisplayBean copy(String key, String value, String id) {
        Intrinsics.checkNotNullParameter(key, "");
        Intrinsics.checkNotNullParameter(value, "");
        Intrinsics.checkNotNullParameter(id, "");
        return new DisplayBean(key, value, id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisplayBean)) {
            return false;
        }
        DisplayBean displayBean = (DisplayBean) other;
        return Intrinsics.areEqual(this.component3, displayBean.component3) && Intrinsics.areEqual(this.ShareDataUIState, displayBean.ShareDataUIState) && Intrinsics.areEqual(this.copydefault, displayBean.copydefault);
    }

    public int hashCode() {
        return (((this.component3.hashCode() * 31) + this.ShareDataUIState.hashCode()) * 31) + this.copydefault.hashCode();
    }

    public String toString() {
        return "DisplayBean(key=" + this.component3 + ", value=" + this.ShareDataUIState + ", id=" + this.copydefault + ')';
    }
}
