package com.huawei.digitalpayment.consumer.sfcui.gsmBalances.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.CounterUnits;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001;Bk\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003Jr\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÇ\u0001¢\u0006\u0002\u0010.J\b\u0010/\u001a\u00020\u0005H\u0007J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H×\u0003J\t\u00104\u001a\u00020\u0005H×\u0001J\t\u00105\u001a\u00020\u0003H×\u0001J\u0018\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u0005H\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u0006<"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/model/UsageConsumptionDetailsUIModel;", "Landroid/os/Parcelable;", "displayName", "", "displayOrder", "", "remaining", "", "cumulative", "status", "Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/model/AccountStatus;", "type", "Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/model/CounterType;", "units", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/model/CounterUnits;", "balanceDetails", "", "Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/model/UsageConsumptionDetailsUIModel$BalanceDetail;", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/model/AccountStatus;Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/model/CounterType;Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/model/CounterUnits;Ljava/util/List;)V", "getDisplayName", "()Ljava/lang/String;", "getDisplayOrder", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRemaining", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getCumulative", "getStatus", "()Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/model/AccountStatus;", "getType", "()Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/model/CounterType;", "getUnits", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/model/CounterUnits;", "getBalanceDetails", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/model/AccountStatus;Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/model/CounterType;Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/model/CounterUnits;Ljava/util/List;)Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/model/UsageConsumptionDetailsUIModel;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "BalanceDetail", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UsageConsumptionDetailsUIModel implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<UsageConsumptionDetailsUIModel> CREATOR = new Creator();
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;
    private final List<BalanceDetail> balanceDetails;
    private final String cumulative;
    private final String displayName;
    private final Integer displayOrder;
    private final Float remaining;
    private final AccountStatus status;
    private final CounterType type;
    private final CounterUnits units;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UsageConsumptionDetailsUIModel> {
        private static int ShareDataUIState = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final UsageConsumptionDetailsUIModel createFromParcel(Parcel parcel) {
            Float f;
            CounterType counterType;
            CounterUnits counterUnitsValueOf;
            int i = 2 % 2;
            int i2 = ShareDataUIState + 27;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                int i4 = ShareDataUIState + 87;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                f = null;
            } else {
                Float fValueOf = Float.valueOf(parcel.readFloat());
                int i6 = ShareDataUIState + 9;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                f = fValueOf;
            }
            String string2 = parcel.readString();
            AccountStatus accountStatusValueOf = parcel.readInt() == 0 ? null : AccountStatus.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                counterType = null;
            } else {
                CounterType counterTypeValueOf = CounterType.valueOf(parcel.readString());
                int i8 = component3 + 125;
                ShareDataUIState = i8 % 128;
                int i9 = i8 % 2;
                counterType = counterTypeValueOf;
            }
            if (parcel.readInt() == 0) {
                int i10 = component3 + 33;
                ShareDataUIState = i10 % 128;
                int i11 = i10 % 2;
                counterUnitsValueOf = null;
            } else {
                counterUnitsValueOf = CounterUnits.valueOf(parcel.readString());
            }
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                arrayList.add(BalanceDetail.CREATOR.createFromParcel(parcel));
            }
            return new UsageConsumptionDetailsUIModel(string, numValueOf, f, string2, accountStatusValueOf, counterType, counterUnitsValueOf, arrayList);
        }

        @Override
        public UsageConsumptionDetailsUIModel createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 15;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                createFromParcel(parcel);
                throw null;
            }
            UsageConsumptionDetailsUIModel usageConsumptionDetailsUIModelCreateFromParcel = createFromParcel(parcel);
            int i3 = ShareDataUIState + 117;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            return usageConsumptionDetailsUIModelCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final UsageConsumptionDetailsUIModel[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState;
            int i4 = i3 + 43;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            UsageConsumptionDetailsUIModel[] usageConsumptionDetailsUIModelArr = new UsageConsumptionDetailsUIModel[i];
            int i6 = i3 + 35;
            component3 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 0 / 0;
            }
            return usageConsumptionDetailsUIModelArr;
        }

        @Override
        public UsageConsumptionDetailsUIModel[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 53;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            UsageConsumptionDetailsUIModel[] usageConsumptionDetailsUIModelArrNewArray = newArray(i);
            int i5 = component3 + 77;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                return usageConsumptionDetailsUIModelArrNewArray;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public UsageConsumptionDetailsUIModel(String str, Integer num, Float f, String str2, AccountStatus accountStatus, CounterType counterType, CounterUnits counterUnits, List<BalanceDetail> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.displayName = str;
        this.displayOrder = num;
        this.remaining = f;
        this.cumulative = str2;
        this.status = accountStatus;
        this.type = counterType;
        this.units = counterUnits;
        this.balanceDetails = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public UsageConsumptionDetailsUIModel(String str, Integer num, Float f, String str2, AccountStatus accountStatus, CounterType counterType, CounterUnits counterUnits, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str3;
        Integer num2;
        String str4;
        CounterType counterType2;
        List listEmptyList;
        AccountStatus accountStatus2 = null;
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            str3 = null;
        } else {
            str3 = str;
        }
        if ((i & 2) != 0) {
            int i3 = component2 + 27;
            copydefault = i3 % 128;
            if (i3 % 2 == 0) {
                accountStatus2.hashCode();
                throw null;
            }
            int i4 = 2 % 2;
            num2 = null;
        } else {
            num2 = num;
        }
        Float f2 = (i & 4) != 0 ? null : f;
        if ((i & 8) != 0) {
            int i5 = 2 % 2;
            str4 = null;
        } else {
            str4 = str2;
        }
        if ((i & 16) != 0) {
            int i6 = copydefault + 53;
            component2 = i6 % 128;
            int i7 = i6 % 2;
        } else {
            accountStatus2 = accountStatus;
        }
        if ((i & 32) != 0) {
            int i8 = copydefault + 119;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            counterType2 = CounterType.UNDEFINED;
        } else {
            counterType2 = counterType;
        }
        CounterUnits counterUnits2 = (i & 64) != 0 ? CounterUnits.UNDEFINED : counterUnits;
        if ((i & 128) != 0) {
            listEmptyList = CollectionsKt.emptyList();
            int i10 = 2 % 2;
        } else {
            listEmptyList = list;
        }
        this(str3, num2, f2, str4, accountStatus2, counterType2, counterUnits2, listEmptyList);
    }

    public final String getDisplayName() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 77;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.displayName;
        int i5 = i2 + 27;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final Integer getDisplayOrder() {
        Integer num;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 49;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            num = this.displayOrder;
            int i4 = 49 / 0;
        } else {
            num = this.displayOrder;
        }
        int i5 = i2 + 27;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Float getRemaining() {
        int i = 2 % 2;
        int i2 = copydefault + 103;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        Float f = this.remaining;
        int i5 = i3 + 111;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final String getCumulative() {
        int i = 2 % 2;
        int i2 = component2 + 67;
        int i3 = i2 % 128;
        copydefault = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.cumulative;
        int i4 = i3 + 117;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final AccountStatus getStatus() {
        int i = 2 % 2;
        int i2 = copydefault + 91;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.status;
        }
        throw null;
    }

    public final CounterType getType() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 23;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        CounterType counterType = this.type;
        int i5 = i2 + 35;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 12 / 0;
        }
        return counterType;
    }

    public final CounterUnits getUnits() {
        int i = 2 % 2;
        int i2 = component2 + 39;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        CounterUnits counterUnits = this.units;
        int i4 = i3 + 85;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return counterUnits;
    }

    public final List<BalanceDetail> getBalanceDetails() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 119;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        List<BalanceDetail> list = this.balanceDetails;
        int i4 = i2 + 89;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 64 / 0;
        }
        return list;
    }

    static {
        int i = component1 + 93;
        component3 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public UsageConsumptionDetailsUIModel() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static UsageConsumptionDetailsUIModel copy$default(UsageConsumptionDetailsUIModel usageConsumptionDetailsUIModel, String str, Integer num, Float f, String str2, AccountStatus accountStatus, CounterType counterType, CounterUnits counterUnits, List list, int i, Object obj) {
        AccountStatus accountStatus2;
        CounterUnits counterUnits2;
        int i2 = 2 % 2;
        String str3 = (i & 1) != 0 ? usageConsumptionDetailsUIModel.displayName : str;
        Integer num2 = (i & 2) != 0 ? usageConsumptionDetailsUIModel.displayOrder : num;
        Float f2 = (i & 4) != 0 ? usageConsumptionDetailsUIModel.remaining : f;
        String str4 = (i & 8) != 0 ? usageConsumptionDetailsUIModel.cumulative : str2;
        if ((i & 16) != 0) {
            accountStatus2 = usageConsumptionDetailsUIModel.status;
            int i3 = component2 + 65;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
        } else {
            accountStatus2 = accountStatus;
        }
        CounterType counterType2 = (i & 32) != 0 ? usageConsumptionDetailsUIModel.type : counterType;
        if ((i & 64) != 0) {
            int i5 = copydefault;
            int i6 = i5 + 9;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            counterUnits2 = usageConsumptionDetailsUIModel.units;
            int i8 = i5 + 11;
            component2 = i8 % 128;
            int i9 = i8 % 2;
        } else {
            counterUnits2 = counterUnits;
        }
        return usageConsumptionDetailsUIModel.copy(str3, num2, f2, str4, accountStatus2, counterType2, counterUnits2, (i & 128) != 0 ? usageConsumptionDetailsUIModel.balanceDetails : list);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 29;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.displayName;
        if (i3 != 0) {
            int i4 = 7 / 0;
        }
        return str;
    }

    public final Integer component2() {
        int i = 2 % 2;
        int i2 = copydefault + 3;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        Integer num = this.displayOrder;
        int i5 = i3 + 31;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Float component3() {
        int i = 2 % 2;
        int i2 = copydefault + 63;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        Float f = this.remaining;
        int i5 = i3 + 81;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return f;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2 + 17;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.cumulative;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final AccountStatus component5() {
        int i = 2 % 2;
        int i2 = copydefault + 51;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.status;
        }
        throw null;
    }

    public final CounterType component6() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 21;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        CounterType counterType = this.type;
        int i4 = i2 + 3;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return counterType;
    }

    public final CounterUnits component7() {
        int i = 2 % 2;
        int i2 = component2 + 39;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        CounterUnits counterUnits = this.units;
        int i5 = i3 + 13;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return counterUnits;
    }

    public final List<BalanceDetail> component8() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 117;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        List<BalanceDetail> list = this.balanceDetails;
        int i4 = i2 + 69;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final UsageConsumptionDetailsUIModel copy(String displayName, Integer displayOrder, Float remaining, String cumulative, AccountStatus status, CounterType type, CounterUnits units, List<BalanceDetail> balanceDetails) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(balanceDetails, "");
        UsageConsumptionDetailsUIModel usageConsumptionDetailsUIModel = new UsageConsumptionDetailsUIModel(displayName, displayOrder, remaining, cumulative, status, type, units, balanceDetails);
        int i2 = copydefault + 115;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return usageConsumptionDetailsUIModel;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2 + 23;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 111;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof UsageConsumptionDetailsUIModel)) {
            int i4 = i2 + 49;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        UsageConsumptionDetailsUIModel usageConsumptionDetailsUIModel = (UsageConsumptionDetailsUIModel) other;
        if (!Intrinsics.areEqual(this.displayName, usageConsumptionDetailsUIModel.displayName)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.displayOrder, usageConsumptionDetailsUIModel.displayOrder)) {
            int i6 = component2 + 57;
            int i7 = i6 % 128;
            copydefault = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 29;
            component2 = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual((Object) this.remaining, (Object) usageConsumptionDetailsUIModel.remaining)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.cumulative, usageConsumptionDetailsUIModel.cumulative)) {
            int i11 = copydefault + 109;
            component2 = i11 % 128;
            return i11 % 2 != 0;
        }
        if (this.status != usageConsumptionDetailsUIModel.status || this.type != usageConsumptionDetailsUIModel.type || this.units != usageConsumptionDetailsUIModel.units || !Intrinsics.areEqual(this.balanceDetails, usageConsumptionDetailsUIModel.balanceDetails)) {
            return false;
        }
        int i12 = component2 + 43;
        copydefault = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 63 / 0;
        }
        return true;
    }

    public int hashCode() {
        String str;
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int i2 = copydefault + 63;
        component2 = i2 % 128;
        int iHashCode4 = (i2 % 2 == 0 ? (str = this.displayName) != null : (str = this.displayName) != null) ? str.hashCode() : 0;
        Integer num = this.displayOrder;
        if (num == null) {
            int i3 = component2 + 21;
            int i4 = i3 % 128;
            copydefault = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 115;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            iHashCode = 0;
        } else {
            iHashCode = num.hashCode();
        }
        Float f = this.remaining;
        int iHashCode5 = f == null ? 0 : f.hashCode();
        String str2 = this.cumulative;
        if (str2 == null) {
            int i8 = copydefault + 75;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        AccountStatus accountStatus = this.status;
        if (accountStatus == null) {
            iHashCode3 = 0;
        } else {
            iHashCode3 = accountStatus.hashCode();
            int i10 = copydefault + 119;
            component2 = i10 % 128;
            int i11 = i10 % 2;
        }
        CounterType counterType = this.type;
        int iHashCode6 = counterType == null ? 0 : counterType.hashCode();
        CounterUnits counterUnits = this.units;
        return (((((((((((((iHashCode4 * 31) + iHashCode) * 31) + iHashCode5) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode6) * 31) + (counterUnits != null ? counterUnits.hashCode() : 0)) * 31) + this.balanceDetails.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UsageConsumptionDetailsUIModel(displayName=" + this.displayName + ", displayOrder=" + this.displayOrder + ", remaining=" + this.remaining + ", cumulative=" + this.cumulative + ", status=" + this.status + ", type=" + this.type + ", units=" + this.units + ", balanceDetails=" + this.balanceDetails + ")";
        int i2 = copydefault + 45;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.displayName);
        Integer num = this.displayOrder;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Float f = this.remaining;
        if (f == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeFloat(f.floatValue());
        }
        dest.writeString(this.cumulative);
        AccountStatus accountStatus = this.status;
        if (accountStatus == null) {
            int i2 = copydefault + 53;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(accountStatus.name());
        }
        CounterType counterType = this.type;
        if (counterType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(counterType.name());
            int i4 = component2 + 73;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        }
        CounterUnits counterUnits = this.units;
        if (counterUnits == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(counterUnits.name());
        }
        List<BalanceDetail> list = this.balanceDetails;
        dest.writeInt(list.size());
        Iterator<BalanceDetail> it = list.iterator();
        int i6 = copydefault + 51;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0092\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÇ\u0001¢\u0006\u0002\u00100J\b\u00101\u001a\u000202H\u0007J\u0013\u00103\u001a\u00020\u000e2\b\u00104\u001a\u0004\u0018\u000105H×\u0003J\t\u00106\u001a\u000202H×\u0001J\t\u00107\u001a\u00020\u0003H×\u0001J\u0018\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u000202H\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001d\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\"\u0010\u0016R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b#\u0010\u0016¨\u0006="}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/model/UsageConsumptionDetailsUIModel$BalanceDetail;", "Landroid/os/Parcelable;", "active", "", "remaining", "", "balanceCode", "expiry", "displayName", "units", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/model/CounterUnits;", "currentCreditUsage", "effectiveTime", "expires", "", "outstandingCreditUsage", "totalCreditAmount", "<init>", "(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/model/CounterUnits;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Float;)V", "getActive", "()Ljava/lang/String;", "getRemaining", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getBalanceCode", "getExpiry", "getDisplayName", "getUnits", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/model/CounterUnits;", "getCurrentCreditUsage", "getEffectiveTime", "getExpires", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOutstandingCreditUsage", "getTotalCreditAmount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/model/CounterUnits;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Float;)Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/model/UsageConsumptionDetailsUIModel$BalanceDetail;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BalanceDetail implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<BalanceDetail> CREATOR = new Creator();
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component2 = 0;
        private static int component3 = 1;
        private final String active;
        private final String balanceCode;
        private final Float currentCreditUsage;
        private final String displayName;
        private final String effectiveTime;
        private final Boolean expires;
        private final String expiry;
        private final Float outstandingCreditUsage;
        private final Float remaining;
        private final Float totalCreditAmount;
        private final CounterUnits units;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BalanceDetail> {
            private static int component3 = 0;
            private static int copydefault = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final BalanceDetail createFromParcel(Parcel parcel) {
                Float f;
                CounterUnits counterUnitsValueOf;
                Boolean boolValueOf;
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    f = null;
                } else {
                    Float fValueOf = Float.valueOf(parcel.readFloat());
                    int i2 = component3 + 57;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    f = fValueOf;
                }
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                if (parcel.readInt() == 0) {
                    int i4 = component3 + 19;
                    copydefault = i4 % 128;
                    int i5 = i4 % 2;
                    counterUnitsValueOf = null;
                } else {
                    counterUnitsValueOf = CounterUnits.valueOf(parcel.readString());
                }
                Float fValueOf2 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                String string5 = parcel.readString();
                if (parcel.readInt() == 0) {
                    int i6 = component3 + 35;
                    copydefault = i6 % 128;
                    if (i6 % 2 == 0) {
                        throw null;
                    }
                    boolValueOf = null;
                } else {
                    boolean z = false;
                    if (parcel.readInt() != 0) {
                        int i7 = component3 + 97;
                        copydefault = i7 % 128;
                        if (i7 % 2 != 0) {
                            z = true;
                        }
                    }
                    boolValueOf = Boolean.valueOf(z);
                }
                return new BalanceDetail(string, f, string2, string3, string4, counterUnitsValueOf, fValueOf2, string5, boolValueOf, parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
            }

            @Override
            public BalanceDetail createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component3 + 75;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                BalanceDetail balanceDetailCreateFromParcel = createFromParcel(parcel);
                int i4 = component3 + 121;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return balanceDetailCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final BalanceDetail[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault;
                int i4 = i3 + 49;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                BalanceDetail[] balanceDetailArr = new BalanceDetail[i];
                int i6 = i3 + 41;
                component3 = i6 % 128;
                if (i6 % 2 == 0) {
                    return balanceDetailArr;
                }
                throw null;
            }

            @Override
            public BalanceDetail[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component3 + 71;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                BalanceDetail[] balanceDetailArrNewArray = newArray(i);
                int i5 = copydefault + 17;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 84 / 0;
                }
                return balanceDetailArrNewArray;
            }
        }

        public BalanceDetail(String str, Float f, String str2, String str3, String str4, CounterUnits counterUnits, Float f2, String str5, Boolean bool, Float f3, Float f4) {
            this.active = str;
            this.remaining = f;
            this.balanceCode = str2;
            this.expiry = str3;
            this.displayName = str4;
            this.units = counterUnits;
            this.currentCreditUsage = f2;
            this.effectiveTime = str5;
            this.expires = bool;
            this.outstandingCreditUsage = f3;
            this.totalCreditAmount = f4;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public BalanceDetail(String str, Float f, String str2, String str3, String str4, CounterUnits counterUnits, Float f2, String str5, Boolean bool, Float f3, Float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            String str6;
            String str7;
            String str8;
            CounterUnits counterUnits2;
            Boolean bool2;
            Float f5 = null;
            if ((i & 1) != 0) {
                int i2 = component1 + 97;
                component2 = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 18 / 0;
                }
                int i4 = 2 % 2;
                str6 = null;
            } else {
                str6 = str;
            }
            Float f6 = (i & 2) != 0 ? null : f;
            if ((i & 4) != 0) {
                int i5 = component2 + 55;
                component1 = i5 % 128;
                if (i5 % 2 == 0) {
                    f5.hashCode();
                    throw null;
                }
                str7 = null;
            } else {
                str7 = str2;
            }
            if ((i & 8) != 0) {
                int i6 = 2 % 2;
                str8 = null;
            } else {
                str8 = str3;
            }
            String str9 = (i & 16) != 0 ? null : str4;
            if ((i & 32) != 0) {
                counterUnits2 = CounterUnits.UNDEFINED;
                int i7 = 2 % 2;
            } else {
                counterUnits2 = counterUnits;
            }
            Float f7 = (i & 64) != 0 ? null : f2;
            String str10 = (i & 128) != 0 ? null : str5;
            if ((i & 256) != 0) {
                bool2 = false;
                int i8 = 2 % 2;
            } else {
                bool2 = bool;
            }
            Float f8 = (i & 512) != 0 ? null : f3;
            if ((i & 1024) != 0) {
                int i9 = 2 % 2;
            } else {
                f5 = f4;
            }
            this(str6, f6, str7, str8, str9, counterUnits2, f7, str10, bool2, f8, f5);
        }

        public final String getActive() {
            int i = 2 % 2;
            int i2 = component2 + 9;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return this.active;
            }
            throw null;
        }

        public final Float getRemaining() {
            int i = 2 % 2;
            int i2 = component1 + 103;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            Float f = this.remaining;
            int i5 = i3 + 93;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 67 / 0;
            }
            return f;
        }

        public final String getBalanceCode() {
            int i = 2 % 2;
            int i2 = component2 + 45;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            String str = this.balanceCode;
            int i5 = i3 + 83;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public final String getExpiry() {
            String str;
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 115;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                str = this.expiry;
                int i4 = 95 / 0;
            } else {
                str = this.expiry;
            }
            int i5 = i2 + 27;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public final String getDisplayName() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 3;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.displayName;
            int i5 = i2 + 17;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 62 / 0;
            }
            return str;
        }

        public final CounterUnits getUnits() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 29;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            CounterUnits counterUnits = this.units;
            int i5 = i2 + 35;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                return counterUnits;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Float getCurrentCreditUsage() {
            int i = 2 % 2;
            int i2 = component1 + 119;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            Float f = this.currentCreditUsage;
            int i5 = i3 + 107;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }

        public final String getEffectiveTime() {
            int i = 2 % 2;
            int i2 = component1 + 99;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            String str = this.effectiveTime;
            int i5 = i3 + 93;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Boolean getExpires() {
            int i = 2 % 2;
            int i2 = component2 + 103;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            Boolean bool = this.expires;
            int i5 = i3 + 57;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                return bool;
            }
            throw null;
        }

        public final Float getOutstandingCreditUsage() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 57;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            Float f = this.outstandingCreditUsage;
            int i5 = i2 + 63;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 96 / 0;
            }
            return f;
        }

        public final Float getTotalCreditAmount() {
            int i = 2 % 2;
            int i2 = component2 + 45;
            int i3 = i2 % 128;
            component1 = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            Float f = this.totalCreditAmount;
            int i4 = i3 + 113;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return f;
        }

        static {
            int i = component3 + 37;
            ShareDataUIState = i % 128;
            int i2 = i % 2;
        }

        public BalanceDetail() {
            this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        }

        public static BalanceDetail copy$default(BalanceDetail balanceDetail, String str, Float f, String str2, String str3, String str4, CounterUnits counterUnits, Float f2, String str5, Boolean bool, Float f3, Float f4, int i, Object obj) {
            Float f5;
            CounterUnits counterUnits2;
            int i2 = 2 % 2;
            int i3 = component2;
            int i4 = i3 + 107;
            component1 = i4 % 128;
            String str6 = (i4 % 2 != 0 ? (i & 1) == 0 : (i & 1) == 0) ? str : balanceDetail.active;
            if ((i & 2) != 0) {
                f5 = balanceDetail.remaining;
                int i5 = i3 + 41;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            } else {
                f5 = f;
            }
            String str7 = (i & 4) != 0 ? balanceDetail.balanceCode : str2;
            String str8 = (i & 8) != 0 ? balanceDetail.expiry : str3;
            String str9 = (i & 16) != 0 ? balanceDetail.displayName : str4;
            if ((i & 32) != 0) {
                int i7 = component1 + 93;
                component2 = i7 % 128;
                if (i7 % 2 != 0) {
                    CounterUnits counterUnits3 = balanceDetail.units;
                    throw null;
                }
                counterUnits2 = balanceDetail.units;
            } else {
                counterUnits2 = counterUnits;
            }
            return balanceDetail.copy(str6, f5, str7, str8, str9, counterUnits2, (i & 64) != 0 ? balanceDetail.currentCreditUsage : f2, (i & 128) != 0 ? balanceDetail.effectiveTime : str5, (i & 256) != 0 ? balanceDetail.expires : bool, (i & 512) != 0 ? balanceDetail.outstandingCreditUsage : f3, (i & 1024) != 0 ? balanceDetail.totalCreditAmount : f4);
        }

        public final String component1() {
            String str;
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 39;
            component1 = i3 % 128;
            if (i3 % 2 == 0) {
                str = this.active;
                int i4 = 63 / 0;
            } else {
                str = this.active;
            }
            int i5 = i2 + 93;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Float component10() {
            int i = 2 % 2;
            int i2 = component1 + 1;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            Float f = this.outstandingCreditUsage;
            int i5 = i3 + 19;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }

        public final Float component11() {
            int i = 2 % 2;
            int i2 = component1 + 109;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            Float f = this.totalCreditAmount;
            int i5 = i3 + 57;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                return f;
            }
            throw null;
        }

        public final Float component2() {
            int i = 2 % 2;
            int i2 = component1 + 41;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Float f = this.remaining;
            if (i3 != 0) {
                int i4 = 16 / 0;
            }
            return f;
        }

        public final String component3() {
            int i = 2 % 2;
            int i2 = component2 + 39;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return this.balanceCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String component4() {
            int i = 2 % 2;
            int i2 = component1 + 91;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            String str = this.expiry;
            int i5 = i3 + 51;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String component5() {
            int i = 2 % 2;
            int i2 = component2 + 103;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return this.displayName;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final CounterUnits component6() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 63;
            component1 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            CounterUnits counterUnits = this.units;
            int i4 = i2 + 67;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return counterUnits;
        }

        public final Float component7() {
            int i = 2 % 2;
            int i2 = component2 + 45;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            Float f = this.currentCreditUsage;
            int i5 = i3 + 43;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }

        public final String component8() {
            int i = 2 % 2;
            int i2 = component2 + 15;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            String str = this.effectiveTime;
            int i5 = i3 + 79;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final Boolean component9() {
            Boolean bool;
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 5;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                bool = this.expires;
                int i4 = 98 / 0;
            } else {
                bool = this.expires;
            }
            int i5 = i2 + 87;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return bool;
        }

        public final BalanceDetail copy(String active, Float remaining, String balanceCode, String expiry, String displayName, CounterUnits units, Float currentCreditUsage, String effectiveTime, Boolean expires, Float outstandingCreditUsage, Float totalCreditAmount) {
            int i = 2 % 2;
            BalanceDetail balanceDetail = new BalanceDetail(active, remaining, balanceCode, expiry, displayName, units, currentCreditUsage, effectiveTime, expires, outstandingCreditUsage, totalCreditAmount);
            int i2 = component1 + 101;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                return balanceDetail;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 77;
            component1 = i3 % 128;
            int i4 = i3 % 2 == 0 ? 1 : 0;
            int i5 = i2 + 93;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                return i4;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                return true;
            }
            if (!(other instanceof BalanceDetail)) {
                int i2 = component1 + 77;
                component2 = i2 % 128;
                if (i2 % 2 == 0) {
                    return false;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            BalanceDetail balanceDetail = (BalanceDetail) other;
            if (!Intrinsics.areEqual(this.active, balanceDetail.active) || !Intrinsics.areEqual((Object) this.remaining, (Object) balanceDetail.remaining)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.balanceCode, balanceDetail.balanceCode)) {
                int i3 = component1 + 37;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.expiry, balanceDetail.expiry)) {
                return Intrinsics.areEqual(this.displayName, balanceDetail.displayName) && this.units == balanceDetail.units && Intrinsics.areEqual((Object) this.currentCreditUsage, (Object) balanceDetail.currentCreditUsage) && Intrinsics.areEqual(this.effectiveTime, balanceDetail.effectiveTime) && Intrinsics.areEqual(this.expires, balanceDetail.expires) && Intrinsics.areEqual((Object) this.outstandingCreditUsage, (Object) balanceDetail.outstandingCreditUsage) && Intrinsics.areEqual((Object) this.totalCreditAmount, (Object) balanceDetail.totalCreditAmount);
            }
            int i5 = component1;
            int i6 = i5 + 111;
            component2 = i6 % 128;
            boolean z = i6 % 2 != 0;
            int i7 = i5 + 119;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            return z;
        }

        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            int iHashCode3;
            int i = 2 % 2;
            String str = this.active;
            int iHashCode4 = str == null ? 0 : str.hashCode();
            Float f = this.remaining;
            int iHashCode5 = f == null ? 0 : f.hashCode();
            String str2 = this.balanceCode;
            if (str2 == null) {
                int i2 = component2 + 55;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str2.hashCode();
            }
            String str3 = this.expiry;
            int iHashCode6 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.displayName;
            int iHashCode7 = str4 == null ? 0 : str4.hashCode();
            CounterUnits counterUnits = this.units;
            int iHashCode8 = counterUnits == null ? 0 : counterUnits.hashCode();
            Float f2 = this.currentCreditUsage;
            if (f2 == null) {
                int i4 = component1 + 51;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                iHashCode2 = 0;
            } else {
                iHashCode2 = f2.hashCode();
            }
            String str5 = this.effectiveTime;
            int iHashCode9 = str5 == null ? 0 : str5.hashCode();
            Boolean bool = this.expires;
            int iHashCode10 = bool == null ? 0 : bool.hashCode();
            Float f3 = this.outstandingCreditUsage;
            if (f3 == null) {
                iHashCode3 = 0;
            } else {
                iHashCode3 = f3.hashCode();
                int i6 = component2 + 59;
                component1 = i6 % 128;
                int i7 = i6 % 2;
            }
            Float f4 = this.totalCreditAmount;
            return (((((((((((((((((((iHashCode4 * 31) + iHashCode5) * 31) + iHashCode) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode2) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode3) * 31) + (f4 != null ? f4.hashCode() : 0);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "BalanceDetail(active=" + this.active + ", remaining=" + this.remaining + ", balanceCode=" + this.balanceCode + ", expiry=" + this.expiry + ", displayName=" + this.displayName + ", units=" + this.units + ", currentCreditUsage=" + this.currentCreditUsage + ", effectiveTime=" + this.effectiveTime + ", expires=" + this.expires + ", outstandingCreditUsage=" + this.outstandingCreditUsage + ", totalCreditAmount=" + this.totalCreditAmount + ")";
            int i2 = component2 + 67;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 41 / 0;
            }
            return str;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component1 + 119;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            if (i3 != 0) {
                dest.writeString(this.active);
                throw null;
            }
            dest.writeString(this.active);
            Float f = this.remaining;
            if (f == null) {
                int i4 = component2 + 39;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    dest.writeInt(1);
                } else {
                    dest.writeInt(0);
                }
            } else {
                dest.writeInt(1);
                dest.writeFloat(f.floatValue());
                int i5 = component2 + 51;
                component1 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 5 % 2;
                }
            }
            dest.writeString(this.balanceCode);
            dest.writeString(this.expiry);
            dest.writeString(this.displayName);
            CounterUnits counterUnits = this.units;
            if (counterUnits == null) {
                int i7 = component1 + 13;
                component2 = i7 % 128;
                int i8 = i7 % 2;
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(counterUnits.name());
            }
            Float f2 = this.currentCreditUsage;
            if (f2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeFloat(f2.floatValue());
            }
            dest.writeString(this.effectiveTime);
            Boolean bool = this.expires;
            if (bool == null) {
                int i9 = component1 + 23;
                component2 = i9 % 128;
                if (i9 % 2 != 0) {
                    dest.writeInt(1);
                } else {
                    dest.writeInt(0);
                }
            } else {
                dest.writeInt(1);
                dest.writeInt(bool.booleanValue() ? 1 : 0);
            }
            Float f3 = this.outstandingCreditUsage;
            if (f3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeFloat(f3.floatValue());
            }
            Float f4 = this.totalCreditAmount;
            if (f4 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeFloat(f4.floatValue());
            }
        }
    }
}
