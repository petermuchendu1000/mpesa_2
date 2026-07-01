package com.huawei.digitalpayment.consumer.home.ui.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/resp/Actions;", "Landroid/os/Parcelable;", "actionName", "", "amount", "relation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActionName", "()Ljava/lang/String;", "getAmount", "getRelation", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Actions implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<Actions> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
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
        private static int component2 = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Actions createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            Actions actions = new Actions(parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component3 + 45;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return actions;
        }

        @Override
        public Actions createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 111;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Actions actionsCreateFromParcel = createFromParcel(parcel);
            int i4 = component3 + 15;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return actionsCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Actions[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 53;
            int i4 = i3 % 128;
            component3 = i4;
            int i5 = i3 % 2;
            Actions[] actionsArr = new Actions[i];
            int i6 = i4 + 63;
            component2 = i6 % 128;
            if (i6 % 2 != 0) {
                return actionsArr;
            }
            throw null;
        }

        @Override
        public Actions[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 47;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            Actions[] actionsArrNewArray = newArray(i);
            int i5 = component3 + 91;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return actionsArrNewArray;
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
        int i2 = component3 + 67;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.actionName;
        }
        throw null;
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = component3 + 33;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.amount;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getRelation() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 73;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.relation;
        int i5 = i2 + 19;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 96 / 0;
        }
        return str;
    }

    static {
        int i = component2 + 115;
        copydefault = i % 128;
        if (i % 2 == 0) {
            int i2 = 2 / 0;
        }
    }

    public static Actions copy$default(Actions actions, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3 + 49;
        int i4 = i3 % 128;
        ShareDataUIState = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 69;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            str = actions.actionName;
        }
        if ((i & 2) != 0) {
            str2 = actions.amount;
        }
        if ((i & 4) != 0) {
            str3 = actions.relation;
        }
        return actions.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.actionName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 63;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.amount;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 57;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.relation;
        int i5 = i3 + 105;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 82 / 0;
        }
        return str;
    }

    public final Actions copy(String actionName, String amount, String relation) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(actionName, "");
        Intrinsics.checkNotNullParameter(amount, "");
        Intrinsics.checkNotNullParameter(relation, "");
        Actions actions = new Actions(actionName, amount, relation);
        int i2 = component3 + 45;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return actions;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 75;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 101;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component3 + 123;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof Actions)) {
            int i4 = component3 + 103;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        Actions actions = (Actions) other;
        if (!Intrinsics.areEqual(this.actionName, actions.actionName) || !Intrinsics.areEqual(this.amount, actions.amount)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.relation, actions.relation)) {
            int i6 = ShareDataUIState + 79;
            int i7 = i6 % 128;
            component3 = i7;
            z = i6 % 2 != 0;
            int i8 = i7 + 119;
            ShareDataUIState = i8 % 128;
            int i9 = i8 % 2;
        }
        return z;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 43;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.actionName.hashCode();
        return i3 == 0 ? (((iHashCode << 16) % this.amount.hashCode()) / 4) % this.relation.hashCode() : (((iHashCode * 31) + this.amount.hashCode()) * 31) + this.relation.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Actions(actionName=" + this.actionName + ", amount=" + this.amount + ", relation=" + this.relation + ")";
        int i2 = ShareDataUIState + 89;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 15 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 59;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 == 0) {
            dest.writeString(this.actionName);
            dest.writeString(this.amount);
            dest.writeString(this.relation);
            throw null;
        }
        dest.writeString(this.actionName);
        dest.writeString(this.amount);
        dest.writeString(this.relation);
        int i4 = component3 + 1;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
