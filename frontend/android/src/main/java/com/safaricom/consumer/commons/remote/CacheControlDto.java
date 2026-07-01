package com.safaricom.consumer.commons.remote;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J$\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/safaricom/consumer/commons/remote/CacheControlDto;", "", "maxAge", "", "noStore", "", "<init>", "(Ljava/lang/Long;Z)V", "getMaxAge", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getNoStore", "()Z", "component1", "component2", "copy", "(Ljava/lang/Long;Z)Lcom/safaricom/consumer/commons/remote/CacheControlDto;", "equals", "other", "hashCode", "", "toString", "", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CacheControlDto {

    @SerializedName("maxAge")
    private final Long ShareDataUIState;

    @SerializedName("noStore")
    private final boolean component3;

    public CacheControlDto(Long l, boolean z) {
        this.ShareDataUIState = l;
        this.component3 = z;
    }

    public CacheControlDto(Long l, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? false : z);
    }

    public final Long getMaxAge() {
        return this.ShareDataUIState;
    }

    public final boolean getNoStore() {
        return this.component3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CacheControlDto() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public static CacheControlDto copy$default(CacheControlDto cacheControlDto, Long l, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            l = cacheControlDto.ShareDataUIState;
        }
        if ((i & 2) != 0) {
            z = cacheControlDto.component3;
        }
        return cacheControlDto.copy(l, z);
    }

    public final Long getShareDataUIState() {
        return this.ShareDataUIState;
    }

    public final boolean getComponent3() {
        return this.component3;
    }

    public final CacheControlDto copy(Long maxAge, boolean noStore) {
        return new CacheControlDto(maxAge, noStore);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CacheControlDto)) {
            return false;
        }
        CacheControlDto cacheControlDto = (CacheControlDto) other;
        return Intrinsics.areEqual(this.ShareDataUIState, cacheControlDto.ShareDataUIState) && this.component3 == cacheControlDto.component3;
    }

    public int hashCode() {
        Long l = this.ShareDataUIState;
        return ((l == null ? 0 : l.hashCode()) * 31) + Boolean.hashCode(this.component3);
    }

    public String toString() {
        return "CacheControlDto(maxAge=" + this.ShareDataUIState + ", noStore=" + this.component3 + ')';
    }
}
