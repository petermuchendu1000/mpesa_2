package com.huawei.digitalpayment.consumer.base.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JK\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u001fHÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006+"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/Balances;", "Landroid/os/Parcelable;", TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY, "", "categoryCode", "totalBalance", "", "measurementUnit", "active", "balanceDetails", "", "Lcom/huawei/digitalpayment/consumer/base/resp/BalanceDetails;", "<init>", "(Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCategory", "()Ljava/lang/String;", "getCategoryCode", "getTotalBalance", "()F", "getMeasurementUnit", "getActive", "getBalanceDetails", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Balances implements Parcelable {
    public static final Parcelable.Creator<Balances> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component2;
    private static int copydefault;

    @SerializedName("active")
    private final String active;

    @SerializedName("balanceDetails")
    private final List<BalanceDetails> balanceDetails;

    @SerializedName(TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY)
    private final String category;

    @SerializedName("categoryCode")
    private final String categoryCode;

    @SerializedName("measurementUnit")
    private final String measurementUnit;

    @SerializedName("totalBalance")
    private final float totalBalance;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Balances> {
        private static int component1 = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Balances createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            float f = parcel.readFloat();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = component3 + 37;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            for (int i5 = 0; i5 != i2; i5++) {
                int i6 = component1 + 123;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                arrayList.add(BalanceDetails.CREATOR.createFromParcel(parcel));
            }
            return new Balances(string, string2, f, string3, string4, arrayList);
        }

        @Override
        public Balances createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 27;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Balances balancesCreateFromParcel = createFromParcel(parcel);
            int i4 = component3 + 5;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return balancesCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Balances[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 41;
            component1 = i3 % 128;
            Balances[] balancesArr = new Balances[i];
            if (i3 % 2 != 0) {
                return balancesArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public Balances[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 73;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                return newArray(i);
            }
            newArray(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public Balances(String str, String str2, float f, String str3, String str4, List<BalanceDetails> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.category = str;
        this.categoryCode = str2;
        this.totalBalance = f;
        this.measurementUnit = str3;
        this.active = str4;
        this.balanceDetails = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Balances(String str, String str2, float f, String str3, String str4, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        String str6;
        String str7;
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            str5 = "";
        } else {
            str5 = str;
        }
        Object obj = null;
        if ((i & 2) != 0) {
            int i3 = component2 + 5;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            str6 = "";
        } else {
            str6 = str2;
        }
        String str8 = (i & 8) != 0 ? "" : str3;
        if ((i & 16) != 0) {
            int i4 = ShareDataUIState + 39;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = 2 % 2;
            str7 = "";
        } else {
            str7 = str4;
        }
        this(str5, str6, f, str8, str7, list);
    }

    public final String getCategory() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 83;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.category;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getCategoryCode() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 79;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            str = this.categoryCode;
            int i4 = 21 / 0;
        } else {
            str = this.categoryCode;
        }
        int i5 = i3 + 77;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 42 / 0;
        }
        return str;
    }

    public final float getTotalBalance() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 89;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        float f = this.totalBalance;
        int i4 = i2 + 47;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return f;
    }

    public final String getMeasurementUnit() {
        int i = 2 % 2;
        int i2 = component2 + 57;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.measurementUnit;
        int i5 = i3 + 7;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getActive() {
        int i = 2 % 2;
        int i2 = component2 + 77;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.active;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<BalanceDetails> getBalanceDetails() {
        List<BalanceDetails> list;
        int i = 2 % 2;
        int i2 = component2 + 71;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            list = this.balanceDetails;
            int i4 = 65 / 0;
        } else {
            list = this.balanceDetails;
        }
        int i5 = i3 + 69;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    static {
        int i = component1 + 25;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Balances copy$default(Balances balances, String str, String str2, float f, String str3, String str4, List list, int i, Object obj) {
        String str5;
        float f2;
        String str6;
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 103;
        ShareDataUIState = i4 % 128;
        String str7 = (i4 % 2 == 0 || (i & 1) == 0) ? str : balances.category;
        if ((i & 2) != 0) {
            str5 = balances.categoryCode;
            int i5 = i3 + 111;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
        } else {
            str5 = str2;
        }
        if ((i & 4) != 0) {
            int i7 = ShareDataUIState + 19;
            component2 = i7 % 128;
            if (i7 % 2 != 0) {
                float f3 = balances.totalBalance;
                throw null;
            }
            f2 = balances.totalBalance;
        } else {
            f2 = f;
        }
        String str8 = (i & 8) != 0 ? balances.measurementUnit : str3;
        if ((i & 16) != 0) {
            int i8 = component2 + 85;
            ShareDataUIState = i8 % 128;
            int i9 = i8 % 2;
            str6 = balances.active;
        } else {
            str6 = str4;
        }
        return balances.copy(str7, str5, f2, str8, str6, (i & 32) != 0 ? balances.balanceDetails : list);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 67;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.category;
        int i5 = i2 + 89;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 93;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.categoryCode;
        if (i3 != 0) {
            int i4 = 50 / 0;
        }
        return str;
    }

    public final float component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 63;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        float f = this.totalBalance;
        int i5 = i2 + 87;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 9 / 0;
        }
        return f;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2 + 123;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.measurementUnit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 71;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.active;
        int i5 = i2 + 119;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<BalanceDetails> component6() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 71;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        List<BalanceDetails> list = this.balanceDetails;
        int i5 = i3 + 11;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Balances copy(String category, String categoryCode, float totalBalance, String measurementUnit, String active, List<BalanceDetails> balanceDetails) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(category, "");
        Intrinsics.checkNotNullParameter(categoryCode, "");
        Intrinsics.checkNotNullParameter(measurementUnit, "");
        Intrinsics.checkNotNullParameter(active, "");
        Intrinsics.checkNotNullParameter(balanceDetails, "");
        Balances balances = new Balances(category, categoryCode, totalBalance, measurementUnit, active, balanceDetails);
        int i2 = component2 + 27;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 98 / 0;
        }
        return balances;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2 + 59;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 99;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component2 + 47;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof Balances)) {
            return false;
        }
        Balances balances = (Balances) other;
        if (!Intrinsics.areEqual(this.category, balances.category)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.categoryCode, balances.categoryCode)) {
            int i4 = ShareDataUIState;
            int i5 = i4 + 89;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 57;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (Float.compare(this.totalBalance, balances.totalBalance) != 0) {
            return false;
        }
        if (!Intrinsics.areEqual(this.measurementUnit, balances.measurementUnit)) {
            int i9 = component2 + 113;
            ShareDataUIState = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.active, balances.active)) {
            int i11 = ShareDataUIState + 69;
            component2 = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.balanceDetails, balances.balanceDetails)) {
            return true;
        }
        int i13 = component2 + 55;
        ShareDataUIState = i13 % 128;
        if (i13 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 7;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((this.category.hashCode() * 31) + this.categoryCode.hashCode()) * 31) + Float.hashCode(this.totalBalance)) * 31) + this.measurementUnit.hashCode()) * 31) + this.active.hashCode()) * 31) + this.balanceDetails.hashCode();
        int i4 = ShareDataUIState + 117;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Balances(category=" + this.category + ", categoryCode=" + this.categoryCode + ", totalBalance=" + this.totalBalance + ", measurementUnit=" + this.measurementUnit + ", active=" + this.active + ", balanceDetails=" + this.balanceDetails + ")";
        int i2 = component2 + 87;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.category);
        dest.writeString(this.categoryCode);
        dest.writeFloat(this.totalBalance);
        dest.writeString(this.measurementUnit);
        dest.writeString(this.active);
        List<BalanceDetails> list = this.balanceDetails;
        dest.writeInt(list.size());
        Iterator<BalanceDetails> it = list.iterator();
        int i2 = component2 + 9;
        ShareDataUIState = i2 % 128;
        while (true) {
            int i3 = i2 % 2;
            if (!it.hasNext()) {
                return;
            }
            it.next().writeToParcel(dest, flags);
            i2 = ShareDataUIState + 1;
            component2 = i2 % 128;
        }
    }
}
