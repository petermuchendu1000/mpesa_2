package com.safaricom.consumer.commons.statements;

import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/safaricom/consumer/commons/statements/PrimaryParty;", "Ljava/io/Serializable;", GriverCacheDao.COLUMN_CACHE_ID, "", "name", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "getType", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PrimaryParty implements Serializable {
    private final String id;
    private final String name;
    private final String type;

    public PrimaryParty(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.id = str;
        this.name = str2;
        this.type = str3;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getType() {
        return this.type;
    }

    public static PrimaryParty copy$default(PrimaryParty primaryParty, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = primaryParty.id;
        }
        if ((i & 2) != 0) {
            str2 = primaryParty.name;
        }
        if ((i & 4) != 0) {
            str3 = primaryParty.type;
        }
        return primaryParty.copy(str, str2, str3);
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getType() {
        return this.type;
    }

    public final PrimaryParty copy(String id, String name, String type) {
        Intrinsics.checkNotNullParameter(id, "");
        Intrinsics.checkNotNullParameter(name, "");
        Intrinsics.checkNotNullParameter(type, "");
        return new PrimaryParty(id, name, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrimaryParty)) {
            return false;
        }
        PrimaryParty primaryParty = (PrimaryParty) other;
        return Intrinsics.areEqual(this.id, primaryParty.id) && Intrinsics.areEqual(this.name, primaryParty.name) && Intrinsics.areEqual(this.type, primaryParty.type);
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "PrimaryParty(id=" + this.id + ", name=" + this.name + ", type=" + this.type + ')';
    }
}
