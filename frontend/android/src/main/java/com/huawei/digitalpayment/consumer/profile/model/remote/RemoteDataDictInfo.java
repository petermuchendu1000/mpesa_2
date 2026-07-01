package com.huawei.digitalpayment.consumer.profile.model.remote;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\"\b\u0002\u0010\u0002\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0003HÆ\u0003J-\u0010\u000b\u001a\u00020\u00002\"\b\u0002\u0010\u0002\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R4\u0010\u0002\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/profile/model/remote/RemoteDataDictInfo;", "", "dictMap", "", "", "<init>", "(Ljava/util/Map;)V", "getDictMap", "()Ljava/util/Map;", "setDictMap", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerProfileModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RemoteDataDictInfo {
    private static int component2 = 1;
    private static int component3;
    private Map<String, ? extends Map<String, String>> dictMap;

    public RemoteDataDictInfo(Map<String, ? extends Map<String, String>> map) {
        this.dictMap = map;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RemoteDataDictInfo(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component2;
            int i3 = i2 + 17;
            component3 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 / 0;
            }
            int i5 = i2 + 97;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            map = null;
        }
        this(map);
    }

    public final Map<String, Map<String, String>> getDictMap() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 53;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Map map = this.dictMap;
        int i4 = i2 + 55;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return map;
    }

    public final void setDictMap(Map<String, ? extends Map<String, String>> map) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 1;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.dictMap = map;
        int i5 = i2 + 39;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RemoteDataDictInfo() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static RemoteDataDictInfo copy$default(RemoteDataDictInfo remoteDataDictInfo, Map map, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2 + 97;
        component3 = i3 % 128;
        int i4 = i & 1;
        if (i3 % 2 == 0 ? i4 != 0 : i4 != 0) {
            map = remoteDataDictInfo.dictMap;
        }
        RemoteDataDictInfo remoteDataDictInfoCopy = remoteDataDictInfo.copy(map);
        int i5 = component3 + 7;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return remoteDataDictInfoCopy;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final Map<String, Map<String, String>> component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 85;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Map map = this.dictMap;
        int i5 = i2 + 31;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final RemoteDataDictInfo copy(Map<String, ? extends Map<String, String>> dictMap) {
        int i = 2 % 2;
        RemoteDataDictInfo remoteDataDictInfo = new RemoteDataDictInfo(dictMap);
        int i2 = component3 + 73;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return remoteDataDictInfo;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this != other) {
            if (!(other instanceof RemoteDataDictInfo)) {
                return false;
            }
            if (Intrinsics.areEqual(this.dictMap, ((RemoteDataDictInfo) other).dictMap)) {
                return true;
            }
            int i2 = component2 + 111;
            component3 = i2 % 128;
            return i2 % 2 != 0;
        }
        int i3 = component3 + 31;
        int i4 = i3 % 128;
        component2 = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 61;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 123;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        Map<String, ? extends Map<String, String>> map = this.dictMap;
        if (map == null) {
            int i4 = i3 + 49;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return 0;
        }
        int iHashCode = map.hashCode();
        int i6 = component2 + 69;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RemoteDataDictInfo(dictMap=" + this.dictMap + ")";
        int i2 = component2 + 21;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 3 / 0;
        }
        return str;
    }
}
