package com.huawei.digitalpayment.consumer.sfcui.sambaza;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/SambazaOptions;", "Landroid/os/Parcelable;", "<init>", "()V", GriverCacheDao.COLUMN_CACHE_ID, "", "getId", "()Ljava/lang/String;", "AirtimeBalance", "CreditLimit", "Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/SambazaOptions$AirtimeBalance;", "Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/SambazaOptions$CreditLimit;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SambazaOptions implements Parcelable {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component2 = 75 % 128;

    public abstract String getId();

    private SambazaOptions() {
    }

    static {
        if (75 % 2 == 0) {
            throw null;
        }
    }

    public SambazaOptions(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0007R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/SambazaOptions$AirtimeBalance;", "Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/SambazaOptions;", "<init>", "()V", GriverCacheDao.COLUMN_CACHE_ID, "", "getId", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AirtimeBalance extends SambazaOptions {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component2 = 0;
        private static int component3 = 1;
        public static final AirtimeBalance INSTANCE = new AirtimeBalance();
        private static final String id = "airtime";
        public static final Parcelable.Creator<AirtimeBalance> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AirtimeBalance> {
            private static int component2 = 1;
            private static int copydefault;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final AirtimeBalance createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = copydefault + 61;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                AirtimeBalance airtimeBalance = AirtimeBalance.INSTANCE;
                int i4 = component2 + 25;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 66 / 0;
                }
                return airtimeBalance;
            }

            @Override
            public AirtimeBalance createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component2 + 105;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                AirtimeBalance airtimeBalanceCreateFromParcel = createFromParcel(parcel);
                int i4 = component2 + 5;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return airtimeBalanceCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final AirtimeBalance[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault;
                int i4 = i3 + 101;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                AirtimeBalance[] airtimeBalanceArr = new AirtimeBalance[i];
                int i6 = i3 + 39;
                component2 = i6 % 128;
                int i7 = i6 % 2;
                return airtimeBalanceArr;
            }

            @Override
            public AirtimeBalance[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault + 121;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                AirtimeBalance[] airtimeBalanceArrNewArray = newArray(i);
                int i5 = component2 + 13;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                return airtimeBalanceArrNewArray;
            }
        }

        private AirtimeBalance() {
            super(null);
        }

        static {
            int i = component2 + 123;
            component1 = i % 128;
            int i2 = i % 2;
        }

        @Override
        public String getId() {
            String str;
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 9;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                str = id;
                int i4 = 97 / 0;
            } else {
                str = id;
            }
            int i5 = i2 + 123;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 21;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 45;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 47;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
            int i4 = ShareDataUIState + 51;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0007R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/SambazaOptions$CreditLimit;", "Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/SambazaOptions;", "<init>", "()V", GriverCacheDao.COLUMN_CACHE_ID, "", "getId", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CreditLimit extends SambazaOptions {
        public static final int $stable = 0;
        private static int ShareDataUIState = 1;
        private static int component1 = 0;
        private static int component2 = 0;
        private static int component3 = 1;
        public static final CreditLimit INSTANCE = new CreditLimit();
        private static final String id = "credit";
        public static final Parcelable.Creator<CreditLimit> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CreditLimit> {
            private static int component1 = 0;
            private static int copydefault = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CreditLimit createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component1 + 39;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                CreditLimit creditLimit = CreditLimit.INSTANCE;
                int i4 = copydefault + 43;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 16 / 0;
                }
                return creditLimit;
            }

            @Override
            public CreditLimit createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = copydefault + 95;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                CreditLimit creditLimitCreateFromParcel = createFromParcel(parcel);
                int i4 = copydefault + 17;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    return creditLimitCreateFromParcel;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CreditLimit[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault + 23;
                component1 = i3 % 128;
                CreditLimit[] creditLimitArr = new CreditLimit[i];
                if (i3 % 2 != 0) {
                    int i4 = 66 / 0;
                }
                return creditLimitArr;
            }

            @Override
            public CreditLimit[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault + 17;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    return newArray(i);
                }
                newArray(i);
                throw null;
            }
        }

        private CreditLimit() {
            super(null);
        }

        static {
            int i = component1 + 75;
            component3 = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public String getId() {
            int i = 2 % 2;
            int i2 = component2 + 81;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            String str = id;
            int i5 = i3 + 121;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component2 + 3;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 59;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component2 + 121;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
            int i4 = component2 + 69;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
        }
    }
}
