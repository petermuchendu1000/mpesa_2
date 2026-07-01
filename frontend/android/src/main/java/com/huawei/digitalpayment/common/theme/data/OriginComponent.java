package com.huawei.digitalpayment.common.theme.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0006HÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/data/OriginComponent;", "Lcom/huawei/digitalpayment/common/theme/data/BaseComponent;", "instanceInfo", "", "configValue", "components", "", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/List;)V", "getInstanceInfo", "()Ljava/lang/Object;", "setInstanceInfo", "(Ljava/lang/Object;)V", "getConfigValue", "setConfigValue", "getComponents", "()Ljava/util/List;", "setComponents", "(Ljava/util/List;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OriginComponent extends BaseComponent {
    private static int component3 = 0;
    private static int copydefault = 1;
    private List<OriginComponent> components;
    private Object configValue;
    private Object instanceInfo;

    /* JADX WARN: Illegal instructions before constructor call */
    public OriginComponent(Object obj, Object obj2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj3 = null;
        if ((i & 1) != 0) {
            int i2 = copydefault + 39;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 37;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            obj = null;
        }
        if ((i & 2) != 0) {
            int i8 = copydefault + 99;
            component3 = i8 % 128;
            if (i8 % 2 != 0) {
                obj3.hashCode();
                throw null;
            }
            obj2 = null;
        }
        if ((i & 4) != 0) {
            int i9 = copydefault + 11;
            component3 = i9 % 128;
            if (i9 % 2 != 0) {
                throw null;
            }
            int i10 = 2 % 2;
            list = null;
        }
        this(obj, obj2, list);
    }

    public final Object getInstanceInfo() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 101;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        Object obj = this.instanceInfo;
        int i5 = i2 + 125;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return obj;
        }
        throw null;
    }

    public final void setInstanceInfo(Object obj) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 99;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.instanceInfo = obj;
        int i5 = i2 + 81;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final Object getConfigValue() {
        int i = 2 % 2;
        int i2 = copydefault + 55;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Object obj = this.configValue;
        int i5 = i3 + 117;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return obj;
    }

    public final void setConfigValue(Object obj) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 59;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.configValue = obj;
        int i5 = i2 + 39;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final List<OriginComponent> getComponents() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 71;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        List<OriginComponent> list = this.components;
        int i5 = i2 + 71;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 71 / 0;
        }
        return list;
    }

    public final void setComponents(List<OriginComponent> list) {
        int i = 2 % 2;
        int i2 = copydefault + 63;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.components = list;
        int i5 = i3 + 103;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public OriginComponent(Object obj, Object obj2, List<OriginComponent> list) {
        super(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
        this.instanceInfo = obj;
        this.configValue = obj2;
        this.components = list;
    }

    public OriginComponent() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static OriginComponent copy$default(OriginComponent originComponent, Object obj, Object obj2, List list, int i, Object obj3) {
        int i2 = 2 % 2;
        int i3 = component3;
        int i4 = i3 + 113;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 61;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            obj = originComponent.instanceInfo;
        }
        if ((i & 2) != 0) {
            int i8 = copydefault + 19;
            component3 = i8 % 128;
            if (i8 % 2 != 0) {
                Object obj4 = originComponent.configValue;
                throw null;
            }
            obj2 = originComponent.configValue;
        }
        if ((i & 4) != 0) {
            list = originComponent.components;
        }
        return originComponent.copy(obj, obj2, list);
    }

    public final Object component1() {
        Object obj;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 85;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            obj = this.instanceInfo;
            int i4 = 22 / 0;
        } else {
            obj = this.instanceInfo;
        }
        int i5 = i2 + 115;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return obj;
    }

    public final Object component2() {
        int i = 2 % 2;
        int i2 = copydefault + 11;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Object obj = this.configValue;
        int i5 = i3 + 59;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return obj;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final List<OriginComponent> component3() {
        int i = 2 % 2;
        int i2 = component3 + 69;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.components;
        }
        throw null;
    }

    public final OriginComponent copy(Object instanceInfo, Object configValue, List<OriginComponent> components) {
        int i = 2 % 2;
        OriginComponent originComponent = new OriginComponent(instanceInfo, configValue, components);
        int i2 = component3 + 107;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return originComponent;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault + 19;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        if (this == other) {
            int i5 = i3 + 15;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof OriginComponent)) {
            return false;
        }
        OriginComponent originComponent = (OriginComponent) other;
        if (!Intrinsics.areEqual(this.instanceInfo, originComponent.instanceInfo)) {
            return false;
        }
        if (Intrinsics.areEqual(this.configValue, originComponent.configValue)) {
            return !(Intrinsics.areEqual(this.components, originComponent.components) ^ true);
        }
        int i7 = copydefault + 15;
        component3 = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        Object obj = this.instanceInfo;
        if (obj == null) {
            int i2 = component3 + 5;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = obj.hashCode();
        }
        Object obj2 = this.configValue;
        if (obj2 == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = obj2.hashCode();
            int i4 = component3 + 97;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        }
        List<OriginComponent> list = this.components;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OriginComponent(instanceInfo=" + this.instanceInfo + ", configValue=" + this.configValue + ", components=" + this.components + ")";
        int i2 = copydefault + 123;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
