package com.safaricom.consumer.commons.bonga;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.digitalpayment.consumer.sfcui.pesa.ui.PESActivity;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/safaricom/consumer/commons/bonga/BongaPointsInfo;", "Landroid/os/Parcelable;", "<init>", "()V", "BongaPointsActive", "BongaPointsInactive", "Lcom/safaricom/consumer/commons/bonga/BongaPointsInfo$BongaPointsActive;", "Lcom/safaricom/consumer/commons/bonga/BongaPointsInfo$BongaPointsInactive;", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BongaPointsInfo implements Parcelable {
    private BongaPointsInfo() {
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, d2 = {"Lcom/safaricom/consumer/commons/bonga/BongaPointsInfo$BongaPointsActive;", "Lcom/safaricom/consumer/commons/bonga/BongaPointsInfo;", "equivalentAmount", "Ljava/math/BigDecimal;", PESActivity.EXTRA_BONGA_POINTS, "", "conversionRate", "", "<init>", "(Ljava/math/BigDecimal;JD)V", "getEquivalentAmount", "()Ljava/math/BigDecimal;", "getBongaPoints", "()J", "getConversionRate", "()D", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BongaPointsActive extends BongaPointsInfo {
        public static final Parcelable.Creator<BongaPointsActive> CREATOR = new Creator();
        private final long bongaPoints;
        private final double conversionRate;
        private final BigDecimal equivalentAmount;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BongaPointsActive> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final BongaPointsActive createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new BongaPointsActive((BigDecimal) parcel.readSerializable(), parcel.readLong(), parcel.readDouble());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final BongaPointsActive[] newArray(int i) {
                return new BongaPointsActive[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BongaPointsActive(BigDecimal bigDecimal, long j, double d2) {
            super(null);
            Intrinsics.checkNotNullParameter(bigDecimal, "");
            this.equivalentAmount = bigDecimal;
            this.bongaPoints = j;
            this.conversionRate = d2;
        }

        public final long getBongaPoints() {
            return this.bongaPoints;
        }

        public final double getConversionRate() {
            return this.conversionRate;
        }

        public final BigDecimal getEquivalentAmount() {
            return this.equivalentAmount;
        }

        public static BongaPointsActive copy$default(BongaPointsActive bongaPointsActive, BigDecimal bigDecimal, long j, double d2, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = bongaPointsActive.equivalentAmount;
            }
            if ((i & 2) != 0) {
                j = bongaPointsActive.bongaPoints;
            }
            long j2 = j;
            if ((i & 4) != 0) {
                d2 = bongaPointsActive.conversionRate;
            }
            return bongaPointsActive.copy(bigDecimal, j2, d2);
        }

        public final BigDecimal getEquivalentAmount() {
            return this.equivalentAmount;
        }

        public final long getBongaPoints() {
            return this.bongaPoints;
        }

        public final double getConversionRate() {
            return this.conversionRate;
        }

        public final BongaPointsActive copy(BigDecimal equivalentAmount, long bongaPoints, double conversionRate) {
            Intrinsics.checkNotNullParameter(equivalentAmount, "");
            return new BongaPointsActive(equivalentAmount, bongaPoints, conversionRate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BongaPointsActive)) {
                return false;
            }
            BongaPointsActive bongaPointsActive = (BongaPointsActive) other;
            return Intrinsics.areEqual(this.equivalentAmount, bongaPointsActive.equivalentAmount) && this.bongaPoints == bongaPointsActive.bongaPoints && Double.compare(this.conversionRate, bongaPointsActive.conversionRate) == 0;
        }

        public int hashCode() {
            return (((this.equivalentAmount.hashCode() * 31) + Long.hashCode(this.bongaPoints)) * 31) + Double.hashCode(this.conversionRate);
        }

        public String toString() {
            return "BongaPointsActive(equivalentAmount=" + this.equivalentAmount + ", bongaPoints=" + this.bongaPoints + ", conversionRate=" + this.conversionRate + ')';
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeSerializable(this.equivalentAmount);
            dest.writeLong(this.bongaPoints);
            dest.writeDouble(this.conversionRate);
        }
    }

    public BongaPointsInfo(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/bonga/BongaPointsInfo$BongaPointsInactive;", "Lcom/safaricom/consumer/commons/bonga/BongaPointsInfo;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BongaPointsInactive extends BongaPointsInfo {
        public static final BongaPointsInactive INSTANCE = new BongaPointsInactive();
        public static final Parcelable.Creator<BongaPointsInactive> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BongaPointsInactive> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final BongaPointsInactive createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return BongaPointsInactive.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final BongaPointsInactive[] newArray(int i) {
                return new BongaPointsInactive[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        private BongaPointsInactive() {
            super(null);
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }
}
