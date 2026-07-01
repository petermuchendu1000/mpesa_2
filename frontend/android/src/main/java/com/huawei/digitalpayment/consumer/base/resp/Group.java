package com.huawei.digitalpayment.consumer.base.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JJ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0006\u0010\u001a\u001a\u00020\u0005J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0005R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006&"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/Group;", "Landroid/os/Parcelable;", "name", "", "order", "", "promotedOrder", "serviceType", "userType", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getOrder", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPromotedOrder", "getServiceType", "getUserType", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/digitalpayment/consumer/base/resp/Group;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Group implements Parcelable {
    public static final Parcelable.Creator<Group> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("name")
    private final String name;

    @SerializedName("order")
    private final Integer order;

    @SerializedName("promotedOrder")
    private final Integer promotedOrder;

    @SerializedName("serviceType")
    private final String serviceType;

    @SerializedName("userType")
    private final String userType;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Group> {
        private static int ShareDataUIState = 1;
        private static int component2;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Group createFromParcel(Parcel parcel) {
            Integer numValueOf;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                int i2 = component2 + 61;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            Group group = new Group(string, numValueOf, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
            int i4 = ShareDataUIState + 97;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                return group;
            }
            throw null;
        }

        @Override
        public Group createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 65;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Group groupCreateFromParcel = createFromParcel(parcel);
            int i4 = ShareDataUIState + 83;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                return groupCreateFromParcel;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Group[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState;
            int i4 = i3 + 51;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            Group[] groupArr = new Group[i];
            int i6 = i3 + 65;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return groupArr;
        }

        @Override
        public Group[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 109;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                return newArray(i);
            }
            newArray(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public Group(String str, Integer num, Integer num2, String str2, String str3) {
        this.name = str;
        this.order = num;
        this.promotedOrder = num2;
        this.serviceType = str2;
        this.userType = str3;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 123;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.name;
        int i5 = i3 + 119;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer getOrder() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 95;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.order;
        if (i3 != 0) {
            int i4 = 62 / 0;
        }
        return num;
    }

    public final Integer getPromotedOrder() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 33;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.promotedOrder;
        }
        throw null;
    }

    public final String getServiceType() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 19;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.serviceType;
        int i4 = i3 + 103;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getUserType() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 1;
        int i3 = i2 % 128;
        component2 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.userType;
        int i4 = i3 + 57;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = copydefault + 45;
        component3 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static Group copy$default(Group group, String str, Integer num, Integer num2, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState;
        int i4 = i3 + 31;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 3;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            str = group.name;
        }
        String str4 = str;
        if ((i & 2) != 0) {
            num = group.order;
        }
        Integer num3 = num;
        if ((i & 4) != 0) {
            num2 = group.promotedOrder;
        }
        Integer num4 = num2;
        if ((i & 8) != 0) {
            str2 = group.serviceType;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            int i8 = component2 + 35;
            int i9 = i8 % 128;
            ShareDataUIState = i9;
            int i10 = i8 % 2;
            str3 = group.userType;
            int i11 = i9 + 35;
            component2 = i11 % 128;
            int i12 = i11 % 2;
        }
        Group groupCopy = group.copy(str4, num3, num4, str5, str3);
        int i13 = component2 + 115;
        ShareDataUIState = i13 % 128;
        int i14 = i13 % 2;
        return groupCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 9;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.name;
        int i5 = i3 + 123;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer component2() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 93;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.order;
        int i5 = i2 + 1;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer component3() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 27;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.promotedOrder;
        int i5 = i2 + 89;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 52 / 0;
        }
        return num;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 79;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.serviceType;
        int i4 = i3 + 73;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 69 / 0;
        }
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component2 + 39;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.userType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Group copy(String name, Integer order, Integer promotedOrder, String serviceType, String userType) {
        int i = 2 % 2;
        Group group = new Group(name, order, promotedOrder, serviceType, userType);
        int i2 = ShareDataUIState + 39;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return group;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 109;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 65;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 46 / 0;
        }
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 15;
        int i4 = i3 % 128;
        component2 = i4;
        int i5 = i3 % 2;
        if (this == other) {
            int i6 = i2 + 17;
            component2 = i6 % 128;
            return i6 % 2 == 0;
        }
        if (!(other instanceof Group)) {
            int i7 = i4 + 39;
            ShareDataUIState = i7 % 128;
            return i7 % 2 == 0;
        }
        Group group = (Group) other;
        if (!Intrinsics.areEqual(this.name, group.name)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.order, group.order)) {
            int i8 = component2 + 121;
            ShareDataUIState = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.promotedOrder, group.promotedOrder)) {
            return Intrinsics.areEqual(this.serviceType, group.serviceType) && Intrinsics.areEqual(this.userType, group.userType);
        }
        int i10 = ShareDataUIState + 31;
        component2 = i10 % 128;
        return i10 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        String str = this.name;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        Integer num = this.order;
        if (num == null) {
            int i2 = component2 + 95;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = num.hashCode();
        }
        Integer num2 = this.promotedOrder;
        if (num2 == null) {
            int i4 = ShareDataUIState + 13;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = num2.hashCode();
        }
        String str2 = this.serviceType;
        if (str2 == null) {
            int i6 = ShareDataUIState + 27;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str2.hashCode();
        }
        String str3 = this.userType;
        return (((((((iHashCode4 * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Group(name=" + this.name + ", order=" + this.order + ", promotedOrder=" + this.promotedOrder + ", serviceType=" + this.serviceType + ", userType=" + this.userType + ")";
        int i2 = component2 + 95;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.name);
        Integer num = this.order;
        if (num == null) {
            int i2 = ShareDataUIState + 23;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.promotedOrder;
        if (num2 == null) {
            int i4 = ShareDataUIState + 55;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        dest.writeString(this.serviceType);
        dest.writeString(this.userType);
    }
}
