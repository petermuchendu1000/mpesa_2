package com.huawei.digitalpayment.consumer.manageandviewdata.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.digitalpayment.consumer.manageandviewdata.dataManager.models.TimeInterval;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÇ\u0001J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H×\u0003J\t\u0010\u0017\u001a\u00020\u0012H×\u0001J\t\u0010\u0018\u001a\u00020\u0019H×\u0001J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0012H\u0007R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/manageandviewdata/resp/IndividualUsageBundleParam;", "Landroid/os/Parcelable;", "accountUsage", "Lcom/huawei/digitalpayment/consumer/manageandviewdata/resp/AccountUsage;", "interval", "Lcom/huawei/digitalpayment/consumer/manageandviewdata/dataManager/models/TimeInterval;", "<init>", "(Lcom/huawei/digitalpayment/consumer/manageandviewdata/resp/AccountUsage;Lcom/huawei/digitalpayment/consumer/manageandviewdata/dataManager/models/TimeInterval;)V", "getAccountUsage", "()Lcom/huawei/digitalpayment/consumer/manageandviewdata/resp/AccountUsage;", "setAccountUsage", "(Lcom/huawei/digitalpayment/consumer/manageandviewdata/resp/AccountUsage;)V", "getInterval", "()Lcom/huawei/digitalpayment/consumer/manageandviewdata/dataManager/models/TimeInterval;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcManageAndViewData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IndividualUsageBundleParam implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<IndividualUsageBundleParam> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault;
    private AccountUsage accountUsage;
    private final TimeInterval interval;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IndividualUsageBundleParam> {
        private static int component1 = 0;
        private static int component2 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final IndividualUsageBundleParam createFromParcel(Parcel parcel) {
            AccountUsage accountUsageCreateFromParcel;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            TimeInterval timeIntervalCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                int i2 = component1 + 63;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                accountUsageCreateFromParcel = null;
            } else {
                accountUsageCreateFromParcel = AccountUsage.CREATOR.createFromParcel(parcel);
                int i4 = component2 + 95;
                component1 = i4 % 128;
                int i5 = i4 % 2;
            }
            AccountUsage accountUsage = accountUsageCreateFromParcel;
            if (parcel.readInt() == 0) {
                int i6 = component1 + 95;
                component2 = i6 % 128;
                int i7 = i6 % 2;
            } else {
                timeIntervalCreateFromParcel = TimeInterval.CREATOR.createFromParcel(parcel);
            }
            return new IndividualUsageBundleParam(accountUsage, timeIntervalCreateFromParcel);
        }

        @Override
        public IndividualUsageBundleParam createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 79;
            component1 = i2 % 128;
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
        public final IndividualUsageBundleParam[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 83;
            component1 = i3 % 128;
            IndividualUsageBundleParam[] individualUsageBundleParamArr = new IndividualUsageBundleParam[i];
            if (i3 % 2 == 0) {
                return individualUsageBundleParamArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public IndividualUsageBundleParam[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 25;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            IndividualUsageBundleParam[] individualUsageBundleParamArrNewArray = newArray(i);
            int i5 = component1 + 39;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                return individualUsageBundleParamArrNewArray;
            }
            throw null;
        }
    }

    public IndividualUsageBundleParam(AccountUsage accountUsage, TimeInterval timeInterval) {
        this.accountUsage = accountUsage;
        this.interval = timeInterval;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IndividualUsageBundleParam(AccountUsage accountUsage, TimeInterval timeInterval, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = ShareDataUIState;
            int i3 = i2 + 85;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 79;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            accountUsage = null;
        }
        if ((i & 2) != 0) {
            int i8 = ShareDataUIState + 49;
            copydefault = i8 % 128;
            if (i8 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i9 = 2 % 2;
            timeInterval = null;
        }
        this(accountUsage, timeInterval);
    }

    public final AccountUsage getAccountUsage() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 119;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        AccountUsage accountUsage = this.accountUsage;
        int i5 = i3 + 15;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return accountUsage;
    }

    public final void setAccountUsage(AccountUsage accountUsage) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 27;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        this.accountUsage = accountUsage;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 121;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final TimeInterval getInterval() {
        int i = 2 % 2;
        int i2 = copydefault + 111;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        TimeInterval timeInterval = this.interval;
        if (i3 == 0) {
            int i4 = 55 / 0;
        }
        return timeInterval;
    }

    static {
        int i = component1 + 87;
        component3 = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IndividualUsageBundleParam() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static IndividualUsageBundleParam copy$default(IndividualUsageBundleParam individualUsageBundleParam, AccountUsage accountUsage, TimeInterval timeInterval, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = copydefault + 103;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                AccountUsage accountUsage2 = individualUsageBundleParam.accountUsage;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            accountUsage = individualUsageBundleParam.accountUsage;
        }
        if ((i & 2) != 0) {
            timeInterval = individualUsageBundleParam.interval;
            int i4 = ShareDataUIState + 75;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        }
        IndividualUsageBundleParam individualUsageBundleParamCopy = individualUsageBundleParam.copy(accountUsage, timeInterval);
        int i6 = copydefault + 73;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return individualUsageBundleParamCopy;
    }

    public final AccountUsage component1() {
        int i = 2 % 2;
        int i2 = copydefault + 67;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.accountUsage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final TimeInterval component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 95;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        TimeInterval timeInterval = this.interval;
        int i5 = i2 + 13;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return timeInterval;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final IndividualUsageBundleParam copy(AccountUsage accountUsage, TimeInterval interval) {
        int i = 2 % 2;
        IndividualUsageBundleParam individualUsageBundleParam = new IndividualUsageBundleParam(accountUsage, interval);
        int i2 = ShareDataUIState + 83;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return individualUsageBundleParam;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 75;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 57;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == other) {
            int i4 = i3 + 5;
            ShareDataUIState = i4 % 128;
            return i4 % 2 != 0;
        }
        if (!(other instanceof IndividualUsageBundleParam)) {
            return false;
        }
        IndividualUsageBundleParam individualUsageBundleParam = (IndividualUsageBundleParam) other;
        if (Intrinsics.areEqual(this.accountUsage, individualUsageBundleParam.accountUsage)) {
            return Intrinsics.areEqual(this.interval, individualUsageBundleParam.interval);
        }
        int i5 = copydefault + 49;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        AccountUsage accountUsage = this.accountUsage;
        if (accountUsage == null) {
            int i5 = i3 + 111;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = accountUsage.hashCode();
        }
        TimeInterval timeInterval = this.interval;
        return (iHashCode * 31) + (timeInterval != null ? timeInterval.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "IndividualUsageBundleParam(accountUsage=" + this.accountUsage + ", interval=" + this.interval + ")";
        int i2 = copydefault + 125;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        AccountUsage accountUsage = this.accountUsage;
        if (accountUsage == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            accountUsage.writeToParcel(dest, flags);
        }
        TimeInterval timeInterval = this.interval;
        if (timeInterval == null) {
            int i2 = copydefault + 51;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            timeInterval.writeToParcel(dest, flags);
        }
        int i4 = copydefault + 111;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
