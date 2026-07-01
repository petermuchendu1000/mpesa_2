package com.huawei.digitalpayment.consumer.profile.model.local;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/profile/model/local/LocalKycGroup;", "Ljava/io/Serializable;", "groupKey", "", "groupName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getGroupKey", "()Ljava/lang/String;", "getGroupName", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerProfileModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LocalKycGroup implements Serializable {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    private final String groupKey;
    private final String groupName;

    public LocalKycGroup(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.groupKey = str;
        this.groupName = str2;
    }

    public final String getGroupKey() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 7;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.groupKey;
        int i5 = i2 + 123;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getGroupName() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 63;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.groupName;
        int i5 = i2 + 7;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static LocalKycGroup copy$default(LocalKycGroup localKycGroup, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = ShareDataUIState + 85;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                String str3 = localKycGroup.groupKey;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str = localKycGroup.groupKey;
        }
        if ((i & 2) != 0) {
            int i4 = component3 + 5;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            str2 = localKycGroup.groupName;
        }
        LocalKycGroup localKycGroupCopy = localKycGroup.copy(str, str2);
        int i6 = ShareDataUIState + 121;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return localKycGroupCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 121;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.groupKey;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 99;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.groupName;
        int i4 = i2 + 35;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final LocalKycGroup copy(String groupKey, String groupName) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(groupKey, "");
        Intrinsics.checkNotNullParameter(groupName, "");
        LocalKycGroup localKycGroup = new LocalKycGroup(groupKey, groupName);
        int i2 = ShareDataUIState + 115;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return localKycGroup;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ShareDataUIState + 13;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof LocalKycGroup)) {
            return false;
        }
        LocalKycGroup localKycGroup = (LocalKycGroup) other;
        if (!Intrinsics.areEqual(this.groupKey, localKycGroup.groupKey)) {
            int i4 = ShareDataUIState + 93;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.groupName, localKycGroup.groupName)) {
            return false;
        }
        int i6 = ShareDataUIState + 23;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 83;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.groupKey.hashCode();
        return i3 == 0 ? (iHashCode + 65) * this.groupName.hashCode() : (iHashCode * 31) + this.groupName.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LocalKycGroup(groupKey=" + this.groupKey + ", groupName=" + this.groupName + ")";
        int i2 = ShareDataUIState + 11;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
