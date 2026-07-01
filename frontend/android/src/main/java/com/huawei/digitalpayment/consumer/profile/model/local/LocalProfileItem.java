package com.huawei.digitalpayment.consumer.profile.model.local;

import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003JC\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/profile/model/local/LocalProfileItem;", "Lcom/huawei/http/BaseResp;", "name", "", "value", "type", KeysConstants.KEY_EXECUTE, "editEnable", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getName", "()Ljava/lang/String;", "getValue", "getType", "getExecute", "getEditEnable", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "ConsumerProfileModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LocalProfileItem extends BaseResp {
    private static int component3 = 1;
    private static int copydefault;
    private final boolean editEnable;
    private final String execute;
    private final String name;
    private final String type;
    private final String value;

    /* JADX WARN: Illegal instructions before constructor call */
    public LocalProfileItem(String str, String str2, String str3, String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 16) != 0) {
            int i2 = component3;
            int i3 = i2 + 25;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 9;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            z = false;
        }
        this(str, str2, str3, str4, z);
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 91;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.name;
        int i5 = i2 + 7;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = component3 + 111;
        int i3 = i2 % 128;
        copydefault = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.value;
        int i4 = i3 + 23;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String getType() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 11;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.type;
        int i5 = i2 + 45;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getExecute() {
        int i = 2 % 2;
        int i2 = copydefault + 1;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.execute;
        }
        throw null;
    }

    public final boolean getEditEnable() {
        int i = 2 % 2;
        int i2 = component3 + 29;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        boolean z = this.editEnable;
        int i5 = i3 + 39;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public LocalProfileItem(String str, String str2, String str3, String str4, boolean z) {
        this.name = str;
        this.value = str2;
        this.type = str3;
        this.execute = str4;
        this.editEnable = z;
    }

    public static LocalProfileItem copy$default(LocalProfileItem localProfileItem, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = localProfileItem.name;
        }
        String str5 = str;
        if ((i & 2) != 0) {
            str2 = localProfileItem.value;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = localProfileItem.type;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            int i3 = component3 + 23;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                String str8 = localProfileItem.execute;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str4 = localProfileItem.execute;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            int i4 = copydefault + 113;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            z = localProfileItem.editEnable;
            if (i5 == 0) {
                int i6 = 25 / 0;
            }
        }
        return localProfileItem.copy(str5, str6, str7, str9, z);
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault + 23;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            str = this.name;
            int i4 = 6 / 0;
        } else {
            str = this.name;
        }
        int i5 = i3 + 13;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3 + 97;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.value;
        int i5 = i3 + 31;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3 + 1;
        int i3 = i2 % 128;
        copydefault = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.type;
        int i4 = i3 + 103;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component3 + 93;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.execute;
        int i5 = i3 + 73;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component5() {
        int i = 2 % 2;
        int i2 = copydefault + 111;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        boolean z = this.editEnable;
        int i5 = i3 + 89;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final LocalProfileItem copy(String name, String value, String type, String execute, boolean editEnable) {
        int i = 2 % 2;
        LocalProfileItem localProfileItem = new LocalProfileItem(name, value, type, execute, editEnable);
        int i2 = copydefault + 107;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return localProfileItem;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component3 + 31;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof LocalProfileItem)) {
            return false;
        }
        LocalProfileItem localProfileItem = (LocalProfileItem) other;
        if (!Intrinsics.areEqual(this.name, localProfileItem.name) || (!Intrinsics.areEqual(this.value, localProfileItem.value)) || !Intrinsics.areEqual(this.type, localProfileItem.type) || !Intrinsics.areEqual(this.execute, localProfileItem.execute)) {
            return false;
        }
        if (this.editEnable == localProfileItem.editEnable) {
            return true;
        }
        int i4 = component3 + 19;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.name;
        if (str == null) {
            int i2 = copydefault;
            int i3 = i2 + 19;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 105;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.value;
        if (str2 == null) {
            int i7 = component3 + 111;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.type;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.execute;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0)) * 31) + Boolean.hashCode(this.editEnable);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LocalProfileItem(name=" + this.name + ", value=" + this.value + ", type=" + this.type + ", execute=" + this.execute + ", editEnable=" + this.editEnable + ")";
        int i2 = copydefault + 91;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
