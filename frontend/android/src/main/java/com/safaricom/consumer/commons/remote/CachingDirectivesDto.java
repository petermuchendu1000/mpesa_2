package com.safaricom.consumer.commons.remote;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/safaricom/consumer/commons/remote/CachingDirectivesDto;", "", "cacheControl", "Lcom/safaricom/consumer/commons/remote/CacheControlDto;", "etag", "", "lastModified", "<init>", "(Lcom/safaricom/consumer/commons/remote/CacheControlDto;Ljava/lang/String;Ljava/lang/String;)V", "getCacheControl", "()Lcom/safaricom/consumer/commons/remote/CacheControlDto;", "getEtag", "()Ljava/lang/String;", "getLastModified", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CachingDirectivesDto {

    @SerializedName("cacheControl")
    private final CacheControlDto component1;

    @SerializedName("lastModified")
    private final String component3;

    @SerializedName("etag")
    private final String copydefault;

    public CachingDirectivesDto(CacheControlDto cacheControlDto, String str, String str2) {
        this.component1 = cacheControlDto;
        this.copydefault = str;
        this.component3 = str2;
    }

    public CachingDirectivesDto(CacheControlDto cacheControlDto, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cacheControlDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }

    public final CacheControlDto getCacheControl() {
        return this.component1;
    }

    public final String getEtag() {
        return this.copydefault;
    }

    public final String getLastModified() {
        return this.component3;
    }

    public CachingDirectivesDto() {
        this(null, null, null, 7, null);
    }

    public static CachingDirectivesDto copy$default(CachingDirectivesDto cachingDirectivesDto, CacheControlDto cacheControlDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            cacheControlDto = cachingDirectivesDto.component1;
        }
        if ((i & 2) != 0) {
            str = cachingDirectivesDto.copydefault;
        }
        if ((i & 4) != 0) {
            str2 = cachingDirectivesDto.component3;
        }
        return cachingDirectivesDto.copy(cacheControlDto, str, str2);
    }

    public final CacheControlDto getComponent1() {
        return this.component1;
    }

    public final String getCopydefault() {
        return this.copydefault;
    }

    public final String getComponent3() {
        return this.component3;
    }

    public final CachingDirectivesDto copy(CacheControlDto cacheControl, String etag, String lastModified) {
        return new CachingDirectivesDto(cacheControl, etag, lastModified);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CachingDirectivesDto)) {
            return false;
        }
        CachingDirectivesDto cachingDirectivesDto = (CachingDirectivesDto) other;
        return Intrinsics.areEqual(this.component1, cachingDirectivesDto.component1) && Intrinsics.areEqual(this.copydefault, cachingDirectivesDto.copydefault) && Intrinsics.areEqual(this.component3, cachingDirectivesDto.component3);
    }

    public int hashCode() {
        CacheControlDto cacheControlDto = this.component1;
        int iHashCode = cacheControlDto == null ? 0 : cacheControlDto.hashCode();
        String str = this.copydefault;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.component3;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "CachingDirectivesDto(cacheControl=" + this.component1 + ", etag=" + this.copydefault + ", lastModified=" + this.component3 + ')';
    }
}
