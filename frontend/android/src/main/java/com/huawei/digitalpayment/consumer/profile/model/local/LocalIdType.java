package com.huawei.digitalpayment.consumer.profile.model.local;

import android.text.TextUtils;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.huawei.digitalpayment.consumer.baselib.dialog.SingleSelectBean;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\n\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0016J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/huawei/digitalpayment/consumer/profile/model/local/LocalIdType;", "Lcom/huawei/digitalpayment/consumer/baselib/dialog/SingleSelectBean;", GriverCacheDao.COLUMN_CACHE_ID, "", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getName", "setName", "getShowContext", "equals", "", "other", "", "hashCode", "", "component1", "component2", "copy", "toString", "ConsumerProfileModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LocalIdType implements SingleSelectBean {
    private static int component3 = 1;
    private static int copydefault;
    private String id;
    private String name;

    public LocalIdType(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
        this.name = str2;
    }

    public final String getId() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault + 7;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            str = this.id;
            int i4 = 60 / 0;
        } else {
            str = this.id;
        }
        int i5 = i3 + 9;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = component3 + 125;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.name;
        int i5 = i3 + 61;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final void setId(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 61;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
            int i3 = 63 / 0;
        }
    }

    public final void setName(String str) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 111;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.name = str;
        int i5 = i2 + 29;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public String getShowContext() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 9;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.name;
        int i5 = i2 + 33;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copydefault + 105;
            component3 = i2 % 128;
            return i2 % 2 != 0;
        }
        if (other instanceof LocalIdType) {
            return TextUtils.equals(((LocalIdType) other).id, this.id);
        }
        int i3 = copydefault + 73;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 21;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.id;
        if (i3 != 0) {
            return Objects.hash(str);
        }
        Object[] objArr = new Object[0];
        objArr[0] = str;
        return Objects.hash(objArr);
    }

    public static LocalIdType copy$default(LocalIdType localIdType, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3 + 51;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 1) != 0) {
            str = localIdType.id;
        }
        if ((i & 2) != 0) {
            str2 = localIdType.name;
        }
        LocalIdType localIdTypeCopy = localIdType.copy(str, str2);
        int i5 = component3 + 105;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return localIdTypeCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 65;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.id;
        int i4 = i3 + 23;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 85;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.name;
        int i5 = i2 + 85;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final LocalIdType copy(String id, String name) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(id, "");
        LocalIdType localIdType = new LocalIdType(id, name);
        int i2 = copydefault + 51;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return localIdType;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LocalIdType(id=" + this.id + ", name=" + this.name + ")";
        int i2 = component3 + 5;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 87 / 0;
        }
        return str;
    }
}
