package com.huawei.digitalpayment.consumer.base.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/Actions;", "Landroid/os/Parcelable;", "actionName", "", "amount", "relation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActionName", "()Ljava/lang/String;", "getAmount", "getRelation", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Actions implements Parcelable {
    public static final Parcelable.Creator<Actions> CREATOR = new Creator();
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("actionName")
    private final String actionName;

    @SerializedName("amount")
    private final String amount;

    @SerializedName("relation")
    private final String relation;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Actions> {
        private static int component1 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Actions createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            Actions actions = new Actions(parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = copydefault + 73;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return actions;
        }

        @Override
        public Actions createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 91;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Actions[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 23;
            int i4 = i3 % 128;
            component1 = i4;
            int i5 = i3 % 2;
            Actions[] actionsArr = new Actions[i];
            int i6 = i4 + 29;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return actionsArr;
        }

        @Override
        public Actions[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 51;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                return newArray(i);
            }
            newArray(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public Actions(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.actionName = str;
        this.amount = str2;
        this.relation = str3;
    }

    public final String getActionName() {
        int i = 2 % 2;
        int i2 = component3 + 123;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.actionName;
        int i5 = i3 + 45;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getAmount() {
        String str;
        int i = 2 % 2;
        int i2 = component1 + 23;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            str = this.amount;
            int i4 = 55 / 0;
        } else {
            str = this.amount;
        }
        int i5 = i3 + 59;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getRelation() {
        int i = 2 % 2;
        int i2 = component3 + 113;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.relation;
        int i5 = i3 + 11;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = copydefault + 77;
        component2 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static Actions copy$default(Actions actions, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component3 + 73;
            component1 = i3 % 128;
            if (i3 % 2 == 0) {
                str = actions.actionName;
                int i4 = 61 / 0;
            } else {
                str = actions.actionName;
            }
        }
        if ((i & 2) != 0) {
            int i5 = component3 + 41;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            str2 = actions.amount;
        }
        if ((i & 4) != 0) {
            str3 = actions.relation;
            int i7 = component1 + 17;
            component3 = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 4 / 5;
            }
        }
        return actions.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 99;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.actionName;
        int i5 = i2 + 99;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3 + 43;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.amount;
        int i5 = i3 + 117;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3 + 57;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.relation;
        }
        throw null;
    }

    public final Actions copy(String actionName, String amount, String relation) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(actionName, "");
        Intrinsics.checkNotNullParameter(amount, "");
        Intrinsics.checkNotNullParameter(relation, "");
        Actions actions = new Actions(actionName, amount, relation);
        int i2 = component1 + 61;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return actions;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 121;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 83;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component1 + 1;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof Actions)) {
            return false;
        }
        Actions actions = (Actions) other;
        if (!Intrinsics.areEqual(this.actionName, actions.actionName) || !Intrinsics.areEqual(this.amount, actions.amount)) {
            return false;
        }
        if (Intrinsics.areEqual(this.relation, actions.relation)) {
            return true;
        }
        int i4 = component1 + 19;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 9;
        component3 = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (((this.actionName.hashCode() / 20) * this.amount.hashCode()) >>> 45) - this.relation.hashCode() : (((this.actionName.hashCode() * 31) + this.amount.hashCode()) * 31) + this.relation.hashCode();
        int i3 = component1 + 121;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Actions(actionName=" + this.actionName + ", amount=" + this.amount + ", relation=" + this.relation + ")";
        int i2 = component3 + 9;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 85;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.actionName);
        dest.writeString(this.amount);
        dest.writeString(this.relation);
        int i4 = component3 + 17;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 56 / 0;
        }
    }
}
