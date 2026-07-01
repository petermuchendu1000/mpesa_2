package com.huawei.digitalpayment.consumer.register.ui.bean;

import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.constants.Keys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\r\u001a\u00020\u000eH×\u0001J\t\u0010\u000f\u001a\u00020\u0010H×\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/register/ui/bean/Relationship;", "", "birthDate", "Lcom/huawei/digitalpayment/consumer/register/ui/bean/RelationshipItem;", "<init>", "(Lcom/huawei/digitalpayment/consumer/register/ui/bean/RelationshipItem;)V", "getBirthDate", "()Lcom/huawei/digitalpayment/consumer/register/ui/bean/RelationshipItem;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ConsumerLoginUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Relationship {
    public static final int $stable = 0;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 55 % 128;
    private static int copydefault = 1;

    @SerializedName(Keys.KYC_KEY_BIRTHDAY)
    private final RelationshipItem ShareDataUIState;

    public Relationship(RelationshipItem relationshipItem) {
        this.ShareDataUIState = relationshipItem;
    }

    public final RelationshipItem getBirthDate() {
        int i = 2 % 2;
        int i2 = component1 + 59;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        RelationshipItem relationshipItem = this.ShareDataUIState;
        int i5 = i3 + 29;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return relationshipItem;
    }

    static {
        if (55 % 2 == 0) {
            throw null;
        }
    }

    public static Relationship copy$default(Relationship relationship, RelationshipItem relationshipItem, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault;
        int i4 = i3 + 113;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 99;
            component1 = i6 % 128;
            if (i6 % 2 != 0) {
                RelationshipItem relationshipItem2 = relationship.ShareDataUIState;
                throw null;
            }
            relationshipItem = relationship.ShareDataUIState;
            int i7 = i3 + 57;
            component1 = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 2 / 2;
            }
        }
        return relationship.copy(relationshipItem);
    }

    public final RelationshipItem component1() {
        RelationshipItem relationshipItem;
        int i = 2 % 2;
        int i2 = component1 + 5;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            relationshipItem = this.ShareDataUIState;
            int i4 = 60 / 0;
        } else {
            relationshipItem = this.ShareDataUIState;
        }
        int i5 = i3 + 29;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return relationshipItem;
    }

    public final Relationship copy(RelationshipItem birthDate) {
        int i = 2 % 2;
        Relationship relationship = new Relationship(birthDate);
        int i2 = copydefault + 123;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 91 / 0;
        }
        return relationship;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 85;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this != other) {
            return (other instanceof Relationship) && Intrinsics.areEqual(this.ShareDataUIState, ((Relationship) other).ShareDataUIState);
        }
        int i4 = i2 + 27;
        copydefault = i4 % 128;
        return i4 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 75;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        RelationshipItem relationshipItem = this.ShareDataUIState;
        if (relationshipItem == null) {
            return 0;
        }
        int iHashCode = relationshipItem.hashCode();
        int i4 = component1 + 9;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Relationship(birthDate=" + this.ShareDataUIState + ")";
        int i2 = component1 + 115;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
