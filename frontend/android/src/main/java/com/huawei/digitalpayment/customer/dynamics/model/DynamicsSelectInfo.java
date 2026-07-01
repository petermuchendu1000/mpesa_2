package com.huawei.digitalpayment.customer.dynamics.model;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/customer/dynamics/model/DynamicsSelectInfo;", "Ljava/io/Serializable;", "key", "", "label", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "getLabel", "setLabel", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "DynamicsView_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DynamicsSelectInfo implements Serializable {
    private static int ShareDataUIState = 1;
    private static int component1;
    private String key;
    private String label;

    public DynamicsSelectInfo(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.key = str;
        this.label = str2;
    }

    public final String getKey() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 13;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.key;
        int i5 = i3 + 57;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getLabel() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 35;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.label;
        int i5 = i2 + 99;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 47 / 0;
        }
        return str;
    }

    public final void setKey(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 113;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.key = str;
        int i4 = ShareDataUIState + 113;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setLabel(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 109;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.label = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.label = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static DynamicsSelectInfo copy$default(DynamicsSelectInfo dynamicsSelectInfo, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1;
        int i4 = i3 + 29;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 89;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            str = dynamicsSelectInfo.key;
            int i8 = i3 + 101;
            ShareDataUIState = i8 % 128;
            int i9 = i8 % 2;
        }
        if ((i & 2) != 0) {
            int i10 = ShareDataUIState + 29;
            component1 = i10 % 128;
            int i11 = i10 % 2;
            str2 = dynamicsSelectInfo.label;
        }
        DynamicsSelectInfo dynamicsSelectInfoCopy = dynamicsSelectInfo.copy(str, str2);
        int i12 = component1 + 89;
        ShareDataUIState = i12 % 128;
        if (i12 % 2 != 0) {
            return dynamicsSelectInfoCopy;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 109;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.key;
        int i5 = i2 + 35;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 43;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.label;
        int i5 = i3 + 33;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 85 / 0;
        }
        return str;
    }

    public final DynamicsSelectInfo copy(String key, String label) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(key, "");
        Intrinsics.checkNotNullParameter(label, "");
        DynamicsSelectInfo dynamicsSelectInfo = new DynamicsSelectInfo(key, label);
        int i2 = ShareDataUIState + 41;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return dynamicsSelectInfo;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component1 + 67;
            ShareDataUIState = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(other instanceof DynamicsSelectInfo)) {
            int i3 = component1 + 77;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.key, ((DynamicsSelectInfo) other).key)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.label, r6.label))) {
            return true;
        }
        int i5 = ShareDataUIState + 5;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 5;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.key.hashCode() * 31) + this.label.hashCode();
        int i4 = component1 + 31;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DynamicsSelectInfo(key=" + this.key + ", label=" + this.label + ")";
        int i2 = component1 + 121;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
