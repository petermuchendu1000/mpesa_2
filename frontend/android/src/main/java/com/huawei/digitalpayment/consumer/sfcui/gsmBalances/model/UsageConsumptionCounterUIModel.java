package com.huawei.digitalpayment.consumer.sfcui.gsmBalances.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.CounterUnits;
import com.iap.ac.android.common.utils.NetworkUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010$\u001a\u00020%J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010 J\t\u00100\u001a\u00020\u0010HÆ\u0003J\u0090\u0001\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÇ\u0001¢\u0006\u0002\u00102J\b\u00103\u001a\u00020\u000eH\u0007J\u0013\u00104\u001a\u00020\u00102\b\u00105\u001a\u0004\u0018\u000106H×\u0003J\t\u00107\u001a\u00020\u000eH×\u0001J\t\u00108\u001a\u00020\u0003H×\u0001J\u0018\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u000eH\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001b\u0010\u0018R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001c\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u0006>"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/model/UsageConsumptionCounterUIModel;", "Landroid/os/Parcelable;", "type", "", "amount", "units", "remaining", "", "status", "total", "outstandingAmount", "dueDate", "displayName", "displayOrder", "", NetworkUtils.NETWORK_TYPE_OFFLINE_STR, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)V", "getType", "()Ljava/lang/String;", "getAmount", "getUnits", "getRemaining", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getStatus", "getTotal", "getOutstandingAmount", "getDueDate", "getDisplayName", "getDisplayOrder", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOffline", "()Z", "toUsageConsumptionCounter", "Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/model/UsageConsumptionCounter;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/model/UsageConsumptionCounterUIModel;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UsageConsumptionCounterUIModel implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<UsageConsumptionCounterUIModel> CREATOR = new Creator();
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;
    private final String amount;
    private final String displayName;
    private final Integer displayOrder;
    private final String dueDate;
    private final boolean offline;
    private final Float outstandingAmount;
    private final Float remaining;
    private final String status;
    private final Float total;
    private final String type;
    private final String units;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UsageConsumptionCounterUIModel> {
        private static int ShareDataUIState = 1;
        private static int component2;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final UsageConsumptionCounterUIModel createFromParcel(Parcel parcel) {
            Float fValueOf;
            boolean z;
            int i = 2 % 2;
            int i2 = ShareDataUIState + 9;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Integer numValueOf = null;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i3 != 0) {
                parcel.readString();
                parcel.readString();
                parcel.readString();
                parcel.readInt();
                throw null;
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Float fValueOf2 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i4 = ShareDataUIState + 27;
                component2 = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
                fValueOf = null;
            } else {
                fValueOf = Float.valueOf(parcel.readFloat());
            }
            Float fValueOf3 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i5 = ShareDataUIState + 111;
                component2 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 83 / 0;
                }
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            Integer num = numValueOf;
            if (parcel.readInt() != 0) {
                int i7 = component2 + 41;
                ShareDataUIState = i7 % 128;
                int i8 = i7 % 2;
                z = true;
            } else {
                z = false;
            }
            return new UsageConsumptionCounterUIModel(string, string2, string3, fValueOf2, string4, fValueOf, fValueOf3, string5, string6, num, z);
        }

        @Override
        public UsageConsumptionCounterUIModel createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 51;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final UsageConsumptionCounterUIModel[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 41;
            component2 = i3 % 128;
            UsageConsumptionCounterUIModel[] usageConsumptionCounterUIModelArr = new UsageConsumptionCounterUIModel[i];
            if (i3 % 2 != 0) {
                int i4 = 10 / 0;
            }
            return usageConsumptionCounterUIModelArr;
        }

        @Override
        public UsageConsumptionCounterUIModel[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 81;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            UsageConsumptionCounterUIModel[] usageConsumptionCounterUIModelArrNewArray = newArray(i);
            int i5 = component2 + 19;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                return usageConsumptionCounterUIModelArrNewArray;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public UsageConsumptionCounterUIModel(String str, String str2, String str3, Float f, String str4, Float f2, Float f3, String str5, String str6, Integer num, boolean z) {
        this.type = str;
        this.amount = str2;
        this.units = str3;
        this.remaining = f;
        this.status = str4;
        this.total = f2;
        this.outstandingAmount = f3;
        this.dueDate = str5;
        this.displayName = str6;
        this.displayOrder = num;
        this.offline = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public UsageConsumptionCounterUIModel(String str, String str2, String str3, Float f, String str4, Float f2, Float f3, String str5, String str6, Integer num, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str7;
        Float f4;
        String str8;
        String str9;
        Integer num2 = null;
        String str10 = (i & 1) != 0 ? null : str;
        String str11 = (i & 2) != 0 ? null : str2;
        if ((i & 4) != 0) {
            int i2 = component1 + 39;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str7 = null;
        } else {
            str7 = str3;
        }
        if ((i & 8) != 0) {
            int i5 = 2 % 2;
            f4 = null;
        } else {
            f4 = f;
        }
        if ((i & 16) != 0) {
            int i6 = 2 % 2;
            str8 = null;
        } else {
            str8 = str4;
        }
        Float f5 = (i & 32) != 0 ? null : f2;
        Float f6 = (i & 64) != 0 ? null : f3;
        if ((i & 128) != 0) {
            int i7 = component2;
            int i8 = i7 + 49;
            component1 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = i7 + 107;
            component1 = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 2 % 2;
            str9 = null;
        } else {
            str9 = str5;
        }
        String str12 = (i & 256) != 0 ? null : str6;
        if ((i & 512) != 0) {
            int i13 = 2 % 2;
        } else {
            num2 = num;
        }
        this(str10, str11, str7, f4, str8, f5, f6, str9, str12, num2, (i & 1024) != 0 ? false : z);
    }

    public final String getType() {
        int i = 2 % 2;
        int i2 = component2 + 119;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.type;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 29;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.amount;
        int i4 = i2 + 55;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getUnits() {
        int i = 2 % 2;
        int i2 = component1 + 33;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.units;
        int i5 = i3 + 33;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final Float getRemaining() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 121;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        Float f = this.remaining;
        int i5 = i2 + 45;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final String getStatus() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 49;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.status;
        int i4 = i2 + 23;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final Float getTotal() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 33;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        Float f = this.total;
        int i5 = i2 + 27;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final Float getOutstandingAmount() {
        int i = 2 % 2;
        int i2 = component2 + 25;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Float f = this.outstandingAmount;
        if (i3 == 0) {
            int i4 = 20 / 0;
        }
        return f;
    }

    public final String getDueDate() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 75;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.dueDate;
        int i5 = i2 + 99;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 44 / 0;
        }
        return str;
    }

    public final String getDisplayName() {
        int i = 2 % 2;
        int i2 = component2 + 123;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.displayName;
        int i5 = i3 + 37;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final Integer getDisplayOrder() {
        int i = 2 % 2;
        int i2 = component1 + 29;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        Integer num = this.displayOrder;
        int i5 = i3 + 25;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final boolean getOffline() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 67;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.offline;
        int i5 = i2 + 65;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final UsageConsumptionCounter toUsageConsumptionCounter() {
        CounterType counterType;
        CounterUnits counterUnits;
        CounterUnits counterUnits2;
        AccountStatus accountStatus;
        int i = 2 % 2;
        CounterType[] counterTypeArrValues = CounterType.values();
        int length = counterTypeArrValues.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                counterType = null;
                break;
            }
            int i4 = component1 + 37;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            counterType = counterTypeArrValues[i3];
            if (Intrinsics.areEqual(counterType.name(), this.type)) {
                break;
            }
            i3++;
            int i6 = component1 + 35;
            component2 = i6 % 128;
            int i7 = i6 % 2;
        }
        if (counterType == null) {
            int i8 = component2 + 53;
            component1 = i8 % 128;
            if (i8 % 2 == 0) {
                counterType = CounterType.UNDEFINED;
                int i9 = 58 / 0;
            } else {
                counterType = CounterType.UNDEFINED;
            }
        }
        CounterType counterType2 = counterType;
        String str = this.amount;
        CounterUnits[] counterUnitsArrValues = CounterUnits.values();
        int length2 = counterUnitsArrValues.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length2) {
                counterUnits = null;
                break;
            }
            int i11 = component1 + 11;
            component2 = i11 % 128;
            int i12 = i11 % 2;
            counterUnits = counterUnitsArrValues[i10];
            if (Intrinsics.areEqual(counterUnits.name(), this.units)) {
                break;
            }
            i10++;
            int i13 = component2 + 107;
            component1 = i13 % 128;
            int i14 = i13 % 2;
        }
        if (counterUnits == null) {
            int i15 = component2 + 69;
            component1 = i15 % 128;
            int i16 = i15 % 2;
            counterUnits2 = CounterUnits.UNDEFINED;
        } else {
            counterUnits2 = counterUnits;
        }
        Float f = this.remaining;
        AccountStatus[] accountStatusArrValues = AccountStatus.values();
        int length3 = accountStatusArrValues.length;
        while (true) {
            if (i2 >= length3) {
                accountStatus = null;
                break;
            }
            int i17 = component1 + 1;
            component2 = i17 % 128;
            int i18 = i17 % 2;
            AccountStatus accountStatus2 = accountStatusArrValues[i2];
            if (Intrinsics.areEqual(accountStatus2.name(), this.status)) {
                accountStatus = accountStatus2;
                break;
            }
            i2++;
        }
        return new UsageConsumptionCounter(counterType2, str, counterUnits2, f, accountStatus, this.total, this.outstandingAmount, this.dueDate, this.displayName, this.displayOrder);
    }

    static {
        int i = copydefault + 45;
        component3 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public UsageConsumptionCounterUIModel() {
        this(null, null, null, null, null, null, null, null, null, null, false, 2047, null);
    }

    public static UsageConsumptionCounterUIModel copy$default(UsageConsumptionCounterUIModel usageConsumptionCounterUIModel, String str, String str2, String str3, Float f, String str4, Float f2, Float f3, String str5, String str6, Integer num, boolean z, int i, Object obj) {
        String str7;
        String str8;
        Float f4;
        Float f5;
        Float f6;
        String str9;
        boolean z2;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component1 + 91;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                str7 = usageConsumptionCounterUIModel.type;
                int i4 = 49 / 0;
            } else {
                str7 = usageConsumptionCounterUIModel.type;
            }
        } else {
            str7 = str;
        }
        if ((i & 2) != 0) {
            int i5 = component1 + 89;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                str8 = usageConsumptionCounterUIModel.amount;
                int i6 = 40 / 0;
            } else {
                str8 = usageConsumptionCounterUIModel.amount;
            }
        } else {
            str8 = str2;
        }
        String str10 = (i & 4) != 0 ? usageConsumptionCounterUIModel.units : str3;
        if ((i & 8) != 0) {
            int i7 = component1 + 105;
            component2 = i7 % 128;
            if (i7 % 2 != 0) {
                Float f7 = usageConsumptionCounterUIModel.remaining;
                throw null;
            }
            f4 = usageConsumptionCounterUIModel.remaining;
        } else {
            f4 = f;
        }
        String str11 = (i & 16) != 0 ? usageConsumptionCounterUIModel.status : str4;
        if ((i & 32) != 0) {
            int i8 = component1 + 93;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            f5 = usageConsumptionCounterUIModel.total;
        } else {
            f5 = f2;
        }
        if ((i & 64) != 0) {
            int i10 = component2 + 81;
            component1 = i10 % 128;
            int i11 = i10 % 2;
            f6 = usageConsumptionCounterUIModel.outstandingAmount;
        } else {
            f6 = f3;
        }
        String str12 = (i & 128) != 0 ? usageConsumptionCounterUIModel.dueDate : str5;
        if ((i & 256) != 0) {
            str9 = usageConsumptionCounterUIModel.displayName;
            int i12 = component1 + 17;
            component2 = i12 % 128;
            int i13 = i12 % 2;
        } else {
            str9 = str6;
        }
        Integer num2 = (i & 512) != 0 ? usageConsumptionCounterUIModel.displayOrder : num;
        if ((i & 1024) != 0) {
            int i14 = component1 + 3;
            component2 = i14 % 128;
            if (i14 % 2 != 0) {
                z2 = usageConsumptionCounterUIModel.offline;
                int i15 = 98 / 0;
            } else {
                z2 = usageConsumptionCounterUIModel.offline;
            }
        } else {
            z2 = z;
        }
        return usageConsumptionCounterUIModel.copy(str7, str8, str10, f4, str11, f5, f6, str12, str9, num2, z2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 65;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.type;
        int i4 = i3 + 49;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final Integer component10() {
        int i = 2 % 2;
        int i2 = component1 + 103;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        Integer num = this.displayOrder;
        int i5 = i3 + 73;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 10 / 0;
        }
        return num;
    }

    public final boolean component11() {
        int i = 2 % 2;
        int i2 = component2 + 101;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        boolean z = this.offline;
        int i5 = i3 + 73;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 83;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.amount;
        int i5 = i3 + 75;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 11;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.units;
        int i5 = i2 + 9;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Float component4() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 69;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Float f = this.remaining;
        int i5 = i2 + 79;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 20 / 0;
        }
        return f;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component2 + 21;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.status;
        int i5 = i3 + 3;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final Float component6() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 61;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Float f = this.total;
        int i5 = i2 + 87;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 57 / 0;
        }
        return f;
    }

    public final Float component7() {
        int i = 2 % 2;
        int i2 = component2 + 51;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.outstandingAmount;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 117;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.dueDate;
        int i5 = i2 + 79;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 111;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.displayName;
        int i5 = i2 + 69;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final UsageConsumptionCounterUIModel copy(String type, String amount, String units, Float remaining, String status, Float total, Float outstandingAmount, String dueDate, String displayName, Integer displayOrder, boolean offline) {
        int i = 2 % 2;
        UsageConsumptionCounterUIModel usageConsumptionCounterUIModel = new UsageConsumptionCounterUIModel(type, amount, units, remaining, status, total, outstandingAmount, dueDate, displayName, displayOrder, offline);
        int i2 = component2 + 23;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return usageConsumptionCounterUIModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 101;
        component2 = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof UsageConsumptionCounterUIModel)) {
            int i2 = component2 + 61;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        UsageConsumptionCounterUIModel usageConsumptionCounterUIModel = (UsageConsumptionCounterUIModel) other;
        if (!Intrinsics.areEqual(this.type, usageConsumptionCounterUIModel.type)) {
            int i4 = component2 + 33;
            component1 = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.amount, usageConsumptionCounterUIModel.amount)) {
            int i5 = component2 + 125;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.units, usageConsumptionCounterUIModel.units)) {
            int i7 = component1 + 21;
            component2 = i7 % 128;
            return i7 % 2 != 0;
        }
        if (!Intrinsics.areEqual((Object) this.remaining, (Object) usageConsumptionCounterUIModel.remaining) || !Intrinsics.areEqual(this.status, usageConsumptionCounterUIModel.status) || !Intrinsics.areEqual((Object) this.total, (Object) usageConsumptionCounterUIModel.total)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object) this.outstandingAmount, (Object) usageConsumptionCounterUIModel.outstandingAmount)) {
            int i8 = component2 + 21;
            component1 = i8 % 128;
            return i8 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.dueDate, usageConsumptionCounterUIModel.dueDate)) {
            int i9 = component1 + 53;
            component2 = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.displayName, usageConsumptionCounterUIModel.displayName)) {
            int i11 = component2 + 21;
            component1 = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.displayOrder, usageConsumptionCounterUIModel.displayOrder)) {
            return false;
        }
        if (this.offline == usageConsumptionCounterUIModel.offline) {
            return true;
        }
        int i13 = component1 + 49;
        component2 = i13 % 128;
        return i13 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int i = 2 % 2;
        String str = this.type;
        int iHashCode6 = 0;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i2 = component2 + 69;
            component1 = i2 % 128;
            int i3 = i2 % 2;
        }
        String str2 = this.amount;
        if (str2 == null) {
            int i4 = component2 + 45;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.units;
        if (str3 == null) {
            int i6 = component1 + 27;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str3.hashCode();
        }
        Float f = this.remaining;
        if (f == null) {
            iHashCode4 = 0;
        } else {
            iHashCode4 = f.hashCode();
            int i8 = component2 + 121;
            component1 = i8 % 128;
            int i9 = i8 % 2;
        }
        String str4 = this.status;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        Float f2 = this.total;
        int iHashCode8 = f2 == null ? 0 : f2.hashCode();
        Float f3 = this.outstandingAmount;
        int iHashCode9 = f3 == null ? 0 : f3.hashCode();
        String str5 = this.dueDate;
        int iHashCode10 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.displayName;
        if (str6 == null) {
            int i10 = component2 + 19;
            component1 = i10 % 128;
            iHashCode5 = i10 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode5 = str6.hashCode();
        }
        Integer num = this.displayOrder;
        if (num == null) {
            int i11 = component1 + 119;
            component2 = i11 % 128;
            int i12 = i11 % 2;
        } else {
            iHashCode6 = num.hashCode();
        }
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + Boolean.hashCode(this.offline);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UsageConsumptionCounterUIModel(type=" + this.type + ", amount=" + this.amount + ", units=" + this.units + ", remaining=" + this.remaining + ", status=" + this.status + ", total=" + this.total + ", outstandingAmount=" + this.outstandingAmount + ", dueDate=" + this.dueDate + ", displayName=" + this.displayName + ", displayOrder=" + this.displayOrder + ", offline=" + this.offline + ")";
        int i2 = component1 + 121;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 29;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 == 0) {
            dest.writeString(this.type);
            dest.writeString(this.amount);
            dest.writeString(this.units);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        dest.writeString(this.type);
        dest.writeString(this.amount);
        dest.writeString(this.units);
        Float f = this.remaining;
        if (f == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeFloat(f.floatValue());
            int i4 = component2 + 67;
            component1 = i4 % 128;
            int i5 = i4 % 2;
        }
        dest.writeString(this.status);
        Float f2 = this.total;
        if (f2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeFloat(f2.floatValue());
        }
        Float f3 = this.outstandingAmount;
        if (f3 == null) {
            int i6 = component1 + 41;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeFloat(f3.floatValue());
        }
        dest.writeString(this.dueDate);
        dest.writeString(this.displayName);
        Integer num = this.displayOrder;
        if (num == null) {
            int i8 = component1 + 39;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeInt(this.offline ? 1 : 0);
    }
}
