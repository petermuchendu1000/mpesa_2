package com.huawei.digitalpayment.home.theme.data.remote;

import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/home/theme/data/remote/RemoteI18nResourceItem;", "Lcom/huawei/http/BaseResp;", "language", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getLanguage", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RemoteI18nResourceItem extends BaseResp {
    private static int component1 = 1;
    private static int component3;
    private final String language;
    private final String value;

    public final String getLanguage() {
        int i = 2 % 2;
        int i2 = component3 + 15;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.language;
        }
        throw null;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = component1 + 51;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.value;
        }
        throw null;
    }

    public RemoteI18nResourceItem(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.language = str;
        this.value = str2;
    }

    public static RemoteI18nResourceItem copy$default(RemoteI18nResourceItem remoteI18nResourceItem, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3 + 89;
        int i4 = i3 % 128;
        component1 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            str = remoteI18nResourceItem.language;
        }
        if ((i & 2) != 0) {
            int i6 = i4 + 65;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            str2 = remoteI18nResourceItem.value;
            if (i7 != 0) {
                int i8 = 90 / 0;
            }
        }
        return remoteI18nResourceItem.copy(str, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 43;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.language;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 89;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.value;
        int i5 = i2 + 43;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final RemoteI18nResourceItem copy(String language, String value) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(language, "");
        Intrinsics.checkNotNullParameter(value, "");
        RemoteI18nResourceItem remoteI18nResourceItem = new RemoteI18nResourceItem(language, value);
        int i2 = component3 + 111;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return remoteI18nResourceItem;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component1 + 17;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof RemoteI18nResourceItem)) {
            return false;
        }
        RemoteI18nResourceItem remoteI18nResourceItem = (RemoteI18nResourceItem) other;
        if (!Intrinsics.areEqual(this.language, remoteI18nResourceItem.language)) {
            int i4 = component3 + 39;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.value, remoteI18nResourceItem.value)) {
            return false;
        }
        int i6 = component3 + 105;
        component1 = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 3;
        component3 = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (this.language.hashCode() % 126) << this.value.hashCode() : (this.language.hashCode() * 31) + this.value.hashCode();
        int i3 = component1 + 27;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RemoteI18nResourceItem(language=" + this.language + ", value=" + this.value + ")";
        int i2 = component1 + 33;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
