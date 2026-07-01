package com.huawei.digitalpayment.consumer.base.database.entities;

import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/entities/DeviceRestartCacheEntity;", "", GriverCacheDao.COLUMN_CACHE_ID, "", RemoteConfigConstants.ResponseFieldKey.STATE, "errorMessage", "requestId", "updatedAtMillis", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getId", "()Ljava/lang/String;", "getState", "getErrorMessage", "getRequestId", "getUpdatedAtMillis", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceRestartCacheEntity {
    private static int copy = 0;
    private static int equals = 1;
    private final String ShareDataUIState;
    private final String component1;
    private final String component2;
    private final String component3;
    private final long copydefault;

    public DeviceRestartCacheEntity(String str, String str2, String str3, String str4, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.component1 = str;
        this.component2 = str2;
        this.component3 = str3;
        this.ShareDataUIState = str4;
        this.copydefault = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DeviceRestartCacheEntity(String str, String str2, String str3, String str4, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        String str6;
        long jCurrentTimeMillis;
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = equals + 65;
            copy = i2 % 128;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            str5 = "device_restart_state";
        } else {
            str5 = str;
        }
        if ((i & 4) != 0) {
            int i3 = copy + 95;
            equals = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            str6 = null;
        } else {
            str6 = str3;
        }
        String str7 = (i & 8) != 0 ? null : str4;
        if ((i & 16) != 0) {
            int i4 = 2 % 2;
            jCurrentTimeMillis = System.currentTimeMillis();
        } else {
            jCurrentTimeMillis = j;
        }
        this(str5, str2, str6, str7, jCurrentTimeMillis);
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = equals + 83;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        String str = this.component1;
        int i5 = i3 + 27;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getState() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 43;
        copy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 17;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 59 / 0;
        }
        return str;
    }

    public final String getErrorMessage() {
        int i = 2 % 2;
        int i2 = equals + 27;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 85;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getRequestId() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 47;
        equals = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.ShareDataUIState;
        int i4 = i2 + 7;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final long getUpdatedAtMillis() {
        int i = 2 % 2;
        int i2 = equals + 31;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        long j = this.copydefault;
        if (i4 != 0) {
            int i5 = 40 / 0;
        }
        int i6 = i3 + 111;
        equals = i6 % 128;
        int i7 = i6 % 2;
        return j;
    }

    public static DeviceRestartCacheEntity copy$default(DeviceRestartCacheEntity deviceRestartCacheEntity, String str, String str2, String str3, String str4, long j, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = equals + 25;
            copy = i3 % 128;
            int i4 = i3 % 2;
            str = deviceRestartCacheEntity.component1;
        }
        String str5 = str;
        if ((i & 2) != 0) {
            str2 = deviceRestartCacheEntity.component2;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = deviceRestartCacheEntity.component3;
            int i5 = copy + 121;
            equals = i5 % 128;
            int i6 = i5 % 2;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            int i7 = copy + 111;
            equals = i7 % 128;
            int i8 = i7 % 2;
            str4 = deviceRestartCacheEntity.ShareDataUIState;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            int i9 = copy + 69;
            equals = i9 % 128;
            if (i9 % 2 == 0) {
                long j2 = deviceRestartCacheEntity.copydefault;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            j = deviceRestartCacheEntity.copydefault;
        }
        return deviceRestartCacheEntity.copy(str5, str6, str7, str8, j);
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = equals + 117;
        int i3 = i2 % 128;
        copy = i3;
        if (i2 % 2 != 0) {
            str = this.component1;
            int i4 = 20 / 0;
        } else {
            str = this.component1;
        }
        int i5 = i3 + 47;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 119;
        equals = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 121;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copy + 111;
        equals = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component3;
        if (i3 == 0) {
            int i4 = 96 / 0;
        }
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = equals + 81;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ShareDataUIState;
        }
        throw null;
    }

    public final long component5() {
        int i = 2 % 2;
        int i2 = equals + 19;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        long j = this.copydefault;
        int i5 = i3 + 39;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 82 / 0;
        }
        return j;
    }

    public final DeviceRestartCacheEntity copy(String id, String state, String errorMessage, String requestId, long updatedAtMillis) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(id, "");
        Intrinsics.checkNotNullParameter(state, "");
        DeviceRestartCacheEntity deviceRestartCacheEntity = new DeviceRestartCacheEntity(id, state, errorMessage, requestId, updatedAtMillis);
        int i2 = equals + 117;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 26 / 0;
        }
        return deviceRestartCacheEntity;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 11;
        equals = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceRestartCacheEntity)) {
            int i4 = i2 + 85;
            equals = i4 % 128;
            return i4 % 2 == 0;
        }
        DeviceRestartCacheEntity deviceRestartCacheEntity = (DeviceRestartCacheEntity) other;
        if (!Intrinsics.areEqual(this.component1, deviceRestartCacheEntity.component1)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.component2, deviceRestartCacheEntity.component2)) {
            int i5 = copy + 73;
            equals = i5 % 128;
            return i5 % 2 == 0;
        }
        if ((!Intrinsics.areEqual(this.component3, deviceRestartCacheEntity.component3)) || !Intrinsics.areEqual(this.ShareDataUIState, deviceRestartCacheEntity.ShareDataUIState)) {
            return false;
        }
        if (this.copydefault == deviceRestartCacheEntity.copydefault) {
            return true;
        }
        int i6 = copy + 117;
        equals = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.component1.hashCode();
        int iHashCode3 = this.component2.hashCode();
        String str = this.component3;
        int iHashCode4 = 0;
        if (str == null) {
            int i2 = copy + 3;
            equals = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.ShareDataUIState;
        if (str2 != null) {
            iHashCode4 = str2.hashCode();
            int i4 = copy + 97;
            equals = i4 % 128;
            int i5 = i4 % 2;
        }
        int iHashCode5 = (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + iHashCode4) * 31) + Long.hashCode(this.copydefault);
        int i6 = equals + 5;
        copy = i6 % 128;
        int i7 = i6 % 2;
        return iHashCode5;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DeviceRestartCacheEntity(id=" + this.component1 + ", state=" + this.component2 + ", errorMessage=" + this.component3 + ", requestId=" + this.ShareDataUIState + ", updatedAtMillis=" + this.copydefault + ")";
        int i2 = equals + 43;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
