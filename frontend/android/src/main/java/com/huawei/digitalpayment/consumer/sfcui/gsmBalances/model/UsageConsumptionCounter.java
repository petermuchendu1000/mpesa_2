package com.huawei.digitalpayment.consumer.sfcui.gsmBalances.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.CounterUnits;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010,\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010$J\u0086\u0001\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÇ\u0001¢\u0006\u0002\u00101J\b\u00102\u001a\u00020\u0011H\u0007J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106H×\u0003J\t\u00107\u001a\u00020\u0011H×\u0001J\t\u00108\u001a\u00020\u0005H×\u0001J\u0018\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u0011H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001f\u0010\u001bR\u001a\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b \u0010\u001bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$¨\u0006>"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/model/UsageConsumptionCounter;", "Landroid/os/Parcelable;", "type", "Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/model/CounterType;", "amount", "", "units", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/model/CounterUnits;", "remaining", "", "status", "Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/model/AccountStatus;", "total", "outstandingAmount", "dueDate", "displayName", "displayOrder", "", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/model/CounterType;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/model/CounterUnits;Ljava/lang/Float;Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/model/AccountStatus;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getType", "()Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/model/CounterType;", "getAmount", "()Ljava/lang/String;", "getUnits", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/model/CounterUnits;", "getRemaining", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getStatus", "()Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/model/AccountStatus;", "getTotal", "getOutstandingAmount", "getDueDate", "getDisplayName", "getDisplayOrder", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/model/CounterType;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/model/CounterUnits;Ljava/lang/Float;Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/model/AccountStatus;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/model/UsageConsumptionCounter;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UsageConsumptionCounter implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<UsageConsumptionCounter> CREATOR = new Creator();
    private static int component1 = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;

    @SerializedName("amount")
    private final String amount;

    @SerializedName("displayName")
    private final String displayName;

    @SerializedName("displayOrder")
    private final Integer displayOrder;

    @SerializedName("dueDate")
    private final String dueDate;

    @SerializedName("outstandingAmount")
    private final Float outstandingAmount;

    @SerializedName("remaining")
    private final Float remaining;

    @SerializedName("status")
    private final AccountStatus status;

    @SerializedName("total")
    private final Float total;

    @SerializedName("type")
    private final CounterType type;

    @SerializedName("unit")
    private final CounterUnits units;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UsageConsumptionCounter> {
        private static int component1 = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final UsageConsumptionCounter createFromParcel(Parcel parcel) {
            CounterType counterTypeValueOf;
            CounterUnits counterUnits;
            AccountStatus accountStatusValueOf;
            Float fValueOf;
            Float fValueOf2;
            int i = 2 % 2;
            int i2 = component1 + 79;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() == 0) {
                int i4 = component3 + 85;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    num.hashCode();
                    throw null;
                }
                counterTypeValueOf = null;
            } else {
                counterTypeValueOf = CounterType.valueOf(parcel.readString());
            }
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                counterUnits = null;
            } else {
                CounterUnits counterUnitsValueOf = CounterUnits.valueOf(parcel.readString());
                int i5 = component1 + 61;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                counterUnits = counterUnitsValueOf;
            }
            Float fValueOf3 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            if (parcel.readInt() == 0) {
                int i7 = component1 + 21;
                component3 = i7 % 128;
                int i8 = i7 % 2;
                accountStatusValueOf = null;
            } else {
                accountStatusValueOf = AccountStatus.valueOf(parcel.readString());
            }
            if (parcel.readInt() == 0) {
                int i9 = component3 + 123;
                component1 = i9 % 128;
                int i10 = i9 % 2;
                fValueOf = null;
            } else {
                fValueOf = Float.valueOf(parcel.readFloat());
            }
            if (parcel.readInt() == 0) {
                int i11 = component3 + 119;
                component1 = i11 % 128;
                if (i11 % 2 == 0) {
                    num.hashCode();
                    throw null;
                }
                fValueOf2 = null;
            } else {
                fValueOf2 = Float.valueOf(parcel.readFloat());
            }
            return new UsageConsumptionCounter(counterTypeValueOf, string, counterUnits, fValueOf3, accountStatusValueOf, fValueOf, fValueOf2, parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override
        public UsageConsumptionCounter createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 109;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final UsageConsumptionCounter[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3;
            int i4 = i3 + 113;
            component1 = i4 % 128;
            Object obj = null;
            UsageConsumptionCounter[] usageConsumptionCounterArr = new UsageConsumptionCounter[i];
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 77;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                return usageConsumptionCounterArr;
            }
            obj.hashCode();
            throw null;
        }

        @Override
        public UsageConsumptionCounter[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 101;
            component1 = i3 % 128;
            if (i3 % 2 == 0) {
                newArray(i);
                throw null;
            }
            UsageConsumptionCounter[] usageConsumptionCounterArrNewArray = newArray(i);
            int i4 = component3 + 115;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return usageConsumptionCounterArrNewArray;
        }
    }

    public UsageConsumptionCounter(CounterType counterType, String str, CounterUnits counterUnits, Float f, AccountStatus accountStatus, Float f2, Float f3, String str2, String str3, Integer num) {
        this.type = counterType;
        this.amount = str;
        this.units = counterUnits;
        this.remaining = f;
        this.status = accountStatus;
        this.total = f2;
        this.outstandingAmount = f3;
        this.dueDate = str2;
        this.displayName = str3;
        this.displayOrder = num;
    }

    public final CounterType getType() {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.type;
        }
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public UsageConsumptionCounter(CounterType counterType, String str, CounterUnits counterUnits, Float f, AccountStatus accountStatus, Float f2, Float f3, String str2, String str3, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str4;
        CounterUnits counterUnits2;
        Float f4;
        AccountStatus accountStatus2;
        Float f5;
        String str5;
        String str6;
        CounterType counterType2 = (i & 1) != 0 ? CounterType.UNDEFINED : counterType;
        if ((i & 2) != 0) {
            int i2 = 2 % 2;
            str4 = null;
        } else {
            str4 = str;
        }
        if ((i & 4) != 0) {
            counterUnits2 = CounterUnits.UNDEFINED;
            int i3 = 2 % 2;
        } else {
            counterUnits2 = counterUnits;
        }
        if ((i & 8) != 0) {
            int i4 = 2 % 2;
            f4 = null;
        } else {
            f4 = f;
        }
        if ((i & 16) != 0) {
            int i5 = component2 + 41;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            accountStatus2 = null;
        } else {
            accountStatus2 = accountStatus;
        }
        Float f6 = (i & 32) != 0 ? null : f2;
        if ((i & 64) != 0) {
            int i7 = copydefault + 119;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            f5 = null;
        } else {
            f5 = f3;
        }
        if ((i & 128) != 0) {
            int i10 = copydefault + 65;
            component2 = i10 % 128;
            if (i10 % 2 == 0) {
                num.hashCode();
                throw null;
            }
            str5 = null;
        } else {
            str5 = str2;
        }
        if ((i & 256) != 0) {
            int i11 = component2 + 81;
            copydefault = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 88 / 0;
            }
            str6 = null;
        } else {
            str6 = str3;
        }
        this(counterType2, str4, counterUnits2, f4, accountStatus2, f6, f5, str5, str6, (i & 512) == 0 ? num : null);
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = component2 + 123;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.amount;
        int i5 = i3 + 103;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final CounterUnits getUnits() {
        int i = 2 % 2;
        int i2 = component2 + 103;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        CounterUnits counterUnits = this.units;
        int i5 = i3 + 47;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return counterUnits;
    }

    public final Float getRemaining() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 65;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        Float f = this.remaining;
        int i5 = i2 + 35;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final AccountStatus getStatus() {
        int i = 2 % 2;
        int i2 = component2 + 69;
        int i3 = i2 % 128;
        copydefault = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        AccountStatus accountStatus = this.status;
        int i4 = i3 + 47;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return accountStatus;
        }
        throw null;
    }

    public final Float getTotal() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 103;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        Float f = this.total;
        int i5 = i2 + 9;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final Float getOutstandingAmount() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 9;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        Float f = this.outstandingAmount;
        int i5 = i2 + 65;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final String getDueDate() {
        int i = 2 % 2;
        int i2 = copydefault + 39;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.dueDate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getDisplayName() {
        int i = 2 % 2;
        int i2 = copydefault + 13;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.displayName;
        if (i3 == 0) {
            int i4 = 22 / 0;
        }
        return str;
    }

    public final Integer getDisplayOrder() {
        int i = 2 % 2;
        int i2 = component2 + 39;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Integer num = this.displayOrder;
        int i4 = i3 + 99;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    static {
        int i = component1 + 33;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public UsageConsumptionCounter() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public static UsageConsumptionCounter copy$default(UsageConsumptionCounter usageConsumptionCounter, CounterType counterType, String str, CounterUnits counterUnits, Float f, AccountStatus accountStatus, Float f2, Float f3, String str2, String str3, Integer num, int i, Object obj) {
        CounterType counterType2;
        String str4;
        CounterUnits counterUnits2;
        Float f4;
        AccountStatus accountStatus2;
        Float f5;
        Integer num2;
        int i2 = 2 % 2;
        int i3 = component2 + 83;
        int i4 = i3 % 128;
        copydefault = i4;
        Object obj2 = null;
        if (i3 % 2 == 0 ? (i & 1) == 0 : (i & 1) == 0) {
            counterType2 = counterType;
        } else {
            int i5 = i4 + 65;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                CounterType counterType3 = usageConsumptionCounter.type;
                throw null;
            }
            counterType2 = usageConsumptionCounter.type;
        }
        if ((i & 2) != 0) {
            int i6 = i4 + 57;
            component2 = i6 % 128;
            if (i6 % 2 == 0) {
                String str5 = usageConsumptionCounter.amount;
                obj2.hashCode();
                throw null;
            }
            str4 = usageConsumptionCounter.amount;
        } else {
            str4 = str;
        }
        if ((i & 4) != 0) {
            int i7 = component2 + 61;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
            counterUnits2 = usageConsumptionCounter.units;
        } else {
            counterUnits2 = counterUnits;
        }
        if ((i & 8) != 0) {
            int i9 = copydefault + 37;
            component2 = i9 % 128;
            int i10 = i9 % 2;
            f4 = usageConsumptionCounter.remaining;
        } else {
            f4 = f;
        }
        if ((i & 16) != 0) {
            accountStatus2 = usageConsumptionCounter.status;
            int i11 = copydefault + 71;
            component2 = i11 % 128;
            int i12 = i11 % 2;
        } else {
            accountStatus2 = accountStatus;
        }
        Float f6 = (i & 32) != 0 ? usageConsumptionCounter.total : f2;
        if ((i & 64) != 0) {
            int i13 = copydefault + 97;
            component2 = i13 % 128;
            if (i13 % 2 == 0) {
                Float f7 = usageConsumptionCounter.outstandingAmount;
                throw null;
            }
            f5 = usageConsumptionCounter.outstandingAmount;
        } else {
            f5 = f3;
        }
        String str6 = (i & 128) != 0 ? usageConsumptionCounter.dueDate : str2;
        String str7 = (i & 256) != 0 ? usageConsumptionCounter.displayName : str3;
        if ((i & 512) != 0) {
            num2 = usageConsumptionCounter.displayOrder;
            int i14 = copydefault + 11;
            component2 = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 3 / 2;
            }
        } else {
            num2 = num;
        }
        return usageConsumptionCounter.copy(counterType2, str4, counterUnits2, f4, accountStatus2, f6, f5, str6, str7, num2);
    }

    public final CounterType component1() {
        CounterType counterType;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 19;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            counterType = this.type;
            int i4 = 59 / 0;
        } else {
            counterType = this.type;
        }
        int i5 = i2 + 41;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return counterType;
    }

    public final Integer component10() {
        int i = 2 % 2;
        int i2 = copydefault + 67;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        Integer num = this.displayOrder;
        int i5 = i3 + 85;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.amount;
        int i5 = i3 + 17;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final CounterUnits component3() {
        int i = 2 % 2;
        int i2 = component2 + 55;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        CounterUnits counterUnits = this.units;
        int i5 = i3 + 19;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return counterUnits;
    }

    public final Float component4() {
        Float f;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 119;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            f = this.remaining;
            int i4 = 6 / 0;
        } else {
            f = this.remaining;
        }
        int i5 = i2 + 123;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return f;
        }
        throw null;
    }

    public final AccountStatus component5() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 119;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        AccountStatus accountStatus = this.status;
        int i4 = i2 + 119;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 49 / 0;
        }
        return accountStatus;
    }

    public final Float component6() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 83;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        Float f = this.total;
        int i5 = i2 + 43;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Float component7() {
        int i = 2 % 2;
        int i2 = component2 + 121;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Float f = this.outstandingAmount;
        int i4 = i3 + 51;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 30 / 0;
        }
        return f;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 7;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.dueDate;
        int i5 = i2 + 5;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = copydefault + 115;
        int i3 = i2 % 128;
        component2 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.displayName;
        int i4 = i3 + 47;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final UsageConsumptionCounter copy(CounterType type, String amount, CounterUnits units, Float remaining, AccountStatus status, Float total, Float outstandingAmount, String dueDate, String displayName, Integer displayOrder) {
        int i = 2 % 2;
        UsageConsumptionCounter usageConsumptionCounter = new UsageConsumptionCounter(type, amount, units, remaining, status, total, outstandingAmount, dueDate, displayName, displayOrder);
        int i2 = component2 + 115;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 73 / 0;
        }
        return usageConsumptionCounter;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault + 49;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof UsageConsumptionCounter)) {
            return false;
        }
        UsageConsumptionCounter usageConsumptionCounter = (UsageConsumptionCounter) other;
        if (this.type != usageConsumptionCounter.type) {
            int i2 = copydefault + 79;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.amount, usageConsumptionCounter.amount) || this.units != usageConsumptionCounter.units || !Intrinsics.areEqual((Object) this.remaining, (Object) usageConsumptionCounter.remaining) || this.status != usageConsumptionCounter.status || !Intrinsics.areEqual((Object) this.total, (Object) usageConsumptionCounter.total)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object) this.outstandingAmount, (Object) usageConsumptionCounter.outstandingAmount)) {
            int i4 = copydefault + 81;
            component2 = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.dueDate, usageConsumptionCounter.dueDate)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.displayName, usageConsumptionCounter.displayName)) {
            int i5 = component2 + 89;
            copydefault = i5 % 128;
            return i5 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.displayOrder, usageConsumptionCounter.displayOrder)) {
            int i6 = component2 + 113;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        int i8 = copydefault + 105;
        component2 = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        CounterType counterType = this.type;
        int iHashCode4 = counterType == null ? 0 : counterType.hashCode();
        String str = this.amount;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        CounterUnits counterUnits = this.units;
        if (counterUnits == null) {
            int i2 = component2 + 39;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = counterUnits.hashCode();
        }
        Float f = this.remaining;
        int iHashCode6 = f == null ? 0 : f.hashCode();
        AccountStatus accountStatus = this.status;
        int iHashCode7 = accountStatus == null ? 0 : accountStatus.hashCode();
        Float f2 = this.total;
        int iHashCode8 = f2 == null ? 0 : f2.hashCode();
        Float f3 = this.outstandingAmount;
        if (f3 == null) {
            int i4 = copydefault + 13;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = f3.hashCode();
            int i6 = copydefault + 43;
            component2 = i6 % 128;
            int i7 = i6 % 2;
        }
        String str2 = this.dueDate;
        if (str2 == null) {
            int i8 = component2 + 43;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str2.hashCode();
        }
        String str3 = this.displayName;
        int iHashCode9 = str3 == null ? 0 : str3.hashCode();
        Integer num = this.displayOrder;
        return (((((((((((((((((iHashCode4 * 31) + iHashCode5) * 31) + iHashCode) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode9) * 31) + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UsageConsumptionCounter(type=" + this.type + ", amount=" + this.amount + ", units=" + this.units + ", remaining=" + this.remaining + ", status=" + this.status + ", total=" + this.total + ", outstandingAmount=" + this.outstandingAmount + ", dueDate=" + this.dueDate + ", displayName=" + this.displayName + ", displayOrder=" + this.displayOrder + ")";
        int i2 = component2 + 21;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        CounterType counterType = this.type;
        if (counterType == null) {
            int i2 = copydefault + 85;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(counterType.name());
        }
        dest.writeString(this.amount);
        CounterUnits counterUnits = this.units;
        if (counterUnits == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(counterUnits.name());
        }
        Float f = this.remaining;
        if (f == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeFloat(f.floatValue());
            int i4 = copydefault + 3;
            component2 = i4 % 128;
            int i5 = i4 % 2;
        }
        AccountStatus accountStatus = this.status;
        if (accountStatus == null) {
            int i6 = copydefault + 103;
            component2 = i6 % 128;
            if (i6 % 2 == 0) {
                dest.writeInt(1);
            } else {
                dest.writeInt(0);
            }
        } else {
            dest.writeInt(1);
            dest.writeString(accountStatus.name());
        }
        Float f2 = this.total;
        if (f2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeFloat(f2.floatValue());
        }
        Float f3 = this.outstandingAmount;
        if (f3 == null) {
            int i7 = copydefault + 47;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeFloat(f3.floatValue());
        }
        dest.writeString(this.dueDate);
        dest.writeString(this.displayName);
        Integer num = this.displayOrder;
        if (num != null) {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        } else {
            int i9 = component2 + 61;
            copydefault = i9 % 128;
            int i10 = i9 % 2;
            dest.writeInt(0);
        }
    }
}
