package com.huawei.digitalpayment.common.theme.data;

import com.huawei.http.BaseResp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/data/MyServiceResp;", "Lcom/huawei/http/BaseResp;", "setBySelf", "", "myServices", "", "Lcom/huawei/digitalpayment/common/theme/data/FunctionResp;", "<init>", "(ZLjava/util/List;)V", "getSetBySelf", "()Z", "setSetBySelf", "(Z)V", "getMyServices", "()Ljava/util/List;", "setMyServices", "(Ljava/util/List;)V", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MyServiceResp extends BaseResp {
    private static int component2 = 1;
    private static int component3;
    private List<? extends FunctionResp> myServices;
    private boolean setBySelf;

    /* JADX WARN: Illegal instructions before constructor call */
    public MyServiceResp(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component2 + 83;
            component3 = i2 % 128;
            z = i2 % 2 != 0;
            int i3 = 2 % 2;
        }
        if ((i & 2) != 0) {
            int i4 = component2 + 47;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 97 / 0;
            }
            int i6 = 2 % 2;
            list = null;
        }
        this(z, list);
    }

    public final boolean getSetBySelf() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 113;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        boolean z = this.setBySelf;
        int i4 = i2 + 39;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final void setSetBySelf(boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 81;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.setBySelf = z;
        int i5 = i3 + 99;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<FunctionResp> getMyServices() {
        int i = 2 % 2;
        int i2 = component2 + 117;
        int i3 = i2 % 128;
        component3 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        List list = this.myServices;
        int i4 = i3 + 97;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final void setMyServices(List<? extends FunctionResp> list) {
        int i = 2 % 2;
        int i2 = component3 + 115;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.myServices = list;
        int i5 = i3 + 33;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public MyServiceResp(boolean z, List<? extends FunctionResp> list) {
        this.setBySelf = z;
        this.myServices = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MyServiceResp() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static MyServiceResp copy$default(MyServiceResp myServiceResp, boolean z, List list, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component3 + 1;
            int i4 = i3 % 128;
            component2 = i4;
            if (i3 % 2 == 0) {
                boolean z2 = myServiceResp.setBySelf;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            z = myServiceResp.setBySelf;
            int i5 = i4 + 67;
            component3 = i5 % 128;
            int i6 = i5 % 2;
        }
        if ((i & 2) != 0) {
            list = myServiceResp.myServices;
        }
        return myServiceResp.copy(z, list);
    }

    public final boolean component1() {
        int i = 2 % 2;
        int i2 = component2 + 35;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.setBySelf;
        }
        throw null;
    }

    public final List<FunctionResp> component2() {
        int i = 2 % 2;
        int i2 = component3 + 5;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        List list = this.myServices;
        if (i3 == 0) {
            int i4 = 61 / 0;
        }
        return list;
    }

    public final MyServiceResp copy(boolean setBySelf, List<? extends FunctionResp> myServices) {
        int i = 2 % 2;
        MyServiceResp myServiceResp = new MyServiceResp(setBySelf, myServices);
        int i2 = component3 + 117;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return myServiceResp;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3 + 59;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        if (this == other) {
            int i5 = i3 + 99;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof MyServiceResp)) {
            int i7 = i3 + 9;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        MyServiceResp myServiceResp = (MyServiceResp) other;
        if (this.setBySelf != myServiceResp.setBySelf) {
            int i9 = i3 + 103;
            component3 = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.myServices, myServiceResp.myServices)) {
            return true;
        }
        int i11 = component3 + 123;
        component2 = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = Boolean.hashCode(this.setBySelf);
        List<? extends FunctionResp> list = this.myServices;
        if (list == null) {
            int i2 = component3 + 121;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 125;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = list.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MyServiceResp(setBySelf=" + this.setBySelf + ", myServices=" + this.myServices + ")";
        int i2 = component2 + 79;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 99 / 0;
        }
        return str;
    }
}
