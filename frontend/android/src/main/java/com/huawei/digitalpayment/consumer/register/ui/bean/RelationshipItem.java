package com.huawei.digitalpayment.consumer.register.ui.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÇ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0014\u001a\u00020\u0005H×\u0001J\t\u0010\u0015\u001a\u00020\u0003H×\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/register/ui/bean/RelationshipItem;", "", "operator", "", "value", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getOperator", "()Ljava/lang/String;", "getValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/huawei/digitalpayment/consumer/register/ui/bean/RelationshipItem;", "equals", "", "other", "hashCode", "toString", "ConsumerLoginUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RelationshipItem {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component3 = 0;
    private static int copydefault = 1;
    private static int equals = 1;
    private final String component1;
    private final Integer component2;

    public RelationshipItem(String str, Integer num) {
        this.component1 = str;
        this.component2 = num;
    }

    public final String getOperator() {
        String str;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 113;
        equals = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.component1;
            int i4 = 71 / 0;
        } else {
            str = this.component1;
        }
        int i5 = i2 + 43;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer getValue() {
        int i = 2 % 2;
        int i2 = component3 + 1;
        int i3 = i2 % 128;
        equals = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Integer num = this.component2;
        int i4 = i3 + 33;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return num;
        }
        obj.hashCode();
        throw null;
    }

    static {
        int i = 1 + 5;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static RelationshipItem copy$default(RelationshipItem relationshipItem, String str, Integer num, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = equals + 111;
        int i4 = i3 % 128;
        component3 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            str = relationshipItem.component1;
        }
        if ((i & 2) != 0) {
            num = relationshipItem.component2;
            int i6 = i4 + 95;
            equals = i6 % 128;
            int i7 = i6 % 2;
        }
        return relationshipItem.copy(str, num);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 47;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        String str = this.component1;
        int i5 = i3 + 31;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final Integer component2() {
        int i = 2 % 2;
        int i2 = equals + 11;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Integer num = this.component2;
        int i5 = i3 + 83;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 66 / 0;
        }
        return num;
    }

    public final RelationshipItem copy(String operator, Integer value) {
        int i = 2 % 2;
        RelationshipItem relationshipItem = new RelationshipItem(operator, value);
        int i2 = equals + 69;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 8 / 0;
        }
        return relationshipItem;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = equals + 9;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (other instanceof RelationshipItem) {
            RelationshipItem relationshipItem = (RelationshipItem) other;
            return Intrinsics.areEqual(this.component1, relationshipItem.component1) && Intrinsics.areEqual(this.component2, relationshipItem.component2);
        }
        int i4 = component3 + 117;
        equals = i4 % 128;
        return i4 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        String str = this.component1;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Integer num = this.component2;
        if (num != null) {
            iHashCode = num.hashCode();
            int i2 = component3 + 121;
            equals = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = (iHashCode2 * 31) + iHashCode;
        int i5 = equals + 23;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RelationshipItem(operator=" + this.component1 + ", value=" + this.component2 + ")";
        int i2 = component3 + 59;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
