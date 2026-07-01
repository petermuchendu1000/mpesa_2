package com.huawei.digitalpayment.consumer.home.ui.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JK\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÇ\u0001J\b\u0010\u001e\u001a\u00020\u001fH\u0007J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H×\u0003J\t\u0010$\u001a\u00020\u001fH×\u0001J\t\u0010%\u001a\u00020\u0003H×\u0001J\u0018\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001fH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006+"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/resp/Balances;", "Landroid/os/Parcelable;", TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY, "", "categoryCode", "totalBalance", "", "measurementUnit", "active", "balanceDetails", "", "Lcom/huawei/digitalpayment/consumer/home/ui/resp/BalanceDetails;", "<init>", "(Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCategory", "()Ljava/lang/String;", "getCategoryCode", "getTotalBalance", "()F", "getMeasurementUnit", "getActive", "getBalanceDetails", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Balances implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Balances> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 1;

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
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;

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
            int i3 = ShareDataUIState + 115;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 0;
            while (i5 != i2) {
                int i6 = copydefault + 69;
                ShareDataUIState = i6 % 128;
                if (i6 % 2 != 0) {
                    arrayList.add(BalanceDetails.CREATOR.createFromParcel(parcel));
                    i5 += 59;
                } else {
                    arrayList.add(BalanceDetails.CREATOR.createFromParcel(parcel));
                    i5++;
                }
            }
            return new Balances(string, string2, f, string3, string4, arrayList);
        }

        @Override
        public Balances createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 83;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Balances balancesCreateFromParcel = createFromParcel(parcel);
            if (i3 == 0) {
                int i4 = 97 / 0;
            }
            int i5 = copydefault + 27;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                return balancesCreateFromParcel;
            }
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Balances[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault;
            int i4 = i3 + 113;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            Balances[] balancesArr = new Balances[i];
            int i6 = i3 + 119;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return balancesArr;
        }

        @Override
        public Balances[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 99;
            copydefault = i3 % 128;
            if (i3 % 2 == 0) {
                newArray(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Balances[] balancesArrNewArray = newArray(i);
            int i4 = copydefault + 29;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 72 / 0;
            }
            return balancesArrNewArray;
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

    public final String getCategory() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 39;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.category;
        int i5 = i2 + 75;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getCategoryCode() {
        int i = 2 % 2;
        int i2 = component3 + 71;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.categoryCode;
        int i5 = i3 + 57;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float getTotalBalance() {
        int i = 2 % 2;
        int i2 = component3 + 121;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float f = this.totalBalance;
        int i4 = i3 + 3;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return f;
    }

    public final String getMeasurementUnit() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 71;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.measurementUnit;
        int i5 = i2 + 53;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getActive() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 75;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.active;
        int i5 = i2 + 73;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final List<BalanceDetails> getBalanceDetails() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 119;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        List<BalanceDetails> list = this.balanceDetails;
        int i5 = i2 + 85;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    static {
        int i = component1 + 121;
        component2 = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Balances copy$default(Balances balances, String str, String str2, float f, String str3, String str4, List list, int i, Object obj) {
        String str5;
        float f2;
        String str6;
        String str7;
        int i2 = 2 % 2;
        int i3 = ShareDataUIState;
        int i4 = i3 + 67;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        String str8 = (i & 1) != 0 ? balances.category : str;
        Object obj2 = null;
        if ((i & 2) != 0) {
            int i6 = i3 + 97;
            component3 = i6 % 128;
            if (i6 % 2 == 0) {
                String str9 = balances.categoryCode;
                obj2.hashCode();
                throw null;
            }
            str5 = balances.categoryCode;
        } else {
            str5 = str2;
        }
        if ((i & 4) != 0) {
            f2 = balances.totalBalance;
            int i7 = i3 + 29;
            component3 = i7 % 128;
            int i8 = i7 % 2;
        } else {
            f2 = f;
        }
        if ((i & 8) != 0) {
            int i9 = i3 + 47;
            component3 = i9 % 128;
            if (i9 % 2 == 0) {
                String str10 = balances.measurementUnit;
                throw null;
            }
            str6 = balances.measurementUnit;
        } else {
            str6 = str3;
        }
        if ((i & 16) != 0) {
            int i10 = component3 + 45;
            ShareDataUIState = i10 % 128;
            int i11 = i10 % 2;
            str7 = balances.active;
        } else {
            str7 = str4;
        }
        return balances.copy(str8, str5, f2, str6, str7, (i & 32) != 0 ? balances.balanceDetails : list);
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = component3 + 3;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            str = this.category;
            int i4 = 2 / 0;
        } else {
            str = this.category;
        }
        int i5 = i3 + 3;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 91 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3 + 33;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.categoryCode;
        }
        throw null;
    }

    public final float component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 109;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        float f = this.totalBalance;
        int i5 = i3 + 1;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final String component4() {
        String str;
        int i = 2 % 2;
        int i2 = component3 + 1;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            str = this.measurementUnit;
            int i4 = 69 / 0;
        } else {
            str = this.measurementUnit;
        }
        int i5 = i3 + 3;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 3;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.active;
        int i5 = i2 + 37;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 35 / 0;
        }
        return str;
    }

    public final List<BalanceDetails> component6() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 115;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        List<BalanceDetails> list = this.balanceDetails;
        int i5 = i2 + 13;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
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
        int i2 = ShareDataUIState + 103;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return balances;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 27;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2 != 0 ? 1 : 0;
        int i5 = i2 + 93;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 105;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        if (this == other) {
            int i5 = i3 + 15;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
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
            int i7 = component3 + 97;
            ShareDataUIState = i7 % 128;
            return i7 % 2 != 0;
        }
        if (Float.compare(this.totalBalance, balances.totalBalance) != 0 || !Intrinsics.areEqual(this.measurementUnit, balances.measurementUnit) || !Intrinsics.areEqual(this.active, balances.active)) {
            return false;
        }
        if (Intrinsics.areEqual(this.balanceDetails, balances.balanceDetails)) {
            return true;
        }
        int i8 = component3 + 37;
        ShareDataUIState = i8 % 128;
        return i8 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 109;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((this.category.hashCode() * 31) + this.categoryCode.hashCode()) * 31) + Float.hashCode(this.totalBalance)) * 31) + this.measurementUnit.hashCode()) * 31) + this.active.hashCode()) * 31) + this.balanceDetails.hashCode();
        int i4 = ShareDataUIState + 91;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Balances(category=" + this.category + ", categoryCode=" + this.categoryCode + ", totalBalance=" + this.totalBalance + ", measurementUnit=" + this.measurementUnit + ", active=" + this.active + ", balanceDetails=" + this.balanceDetails + ")";
        int i2 = ShareDataUIState + 115;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 119;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.category);
        dest.writeString(this.categoryCode);
        dest.writeFloat(this.totalBalance);
        dest.writeString(this.measurementUnit);
        dest.writeString(this.active);
        List<BalanceDetails> list = this.balanceDetails;
        dest.writeInt(list.size());
        Iterator<BalanceDetails> it = list.iterator();
        int i4 = component3 + 103;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        while (!(!it.hasNext())) {
            it.next().writeToParcel(dest, flags);
        }
    }
}
