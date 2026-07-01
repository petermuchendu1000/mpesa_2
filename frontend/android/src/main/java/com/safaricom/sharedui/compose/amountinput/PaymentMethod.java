package com.safaricom.sharedui.compose.amountinput;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.digitalpayment.consumer.sfcui.pesa.ui.PESActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/safaricom/sharedui/compose/amountinput/PaymentMethod;", "Landroid/os/Parcelable;", "<init>", "()V", "MPesaBalance", "BongaPoints", "Lcom/safaricom/sharedui/compose/amountinput/PaymentMethod$BongaPoints;", "Lcom/safaricom/sharedui/compose/amountinput/PaymentMethod$MPesaBalance;", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PaymentMethod implements Parcelable {
    public static final int $stable = 0;

    private PaymentMethod() {
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0007¨\u0006\u000b"}, d2 = {"Lcom/safaricom/sharedui/compose/amountinput/PaymentMethod$MPesaBalance;", "Lcom/safaricom/sharedui/compose/amountinput/PaymentMethod;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MPesaBalance extends PaymentMethod {
        public static final int $stable = 0;
        public static final MPesaBalance INSTANCE = new MPesaBalance();
        public static final Parcelable.Creator<MPesaBalance> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MPesaBalance> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final MPesaBalance createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return MPesaBalance.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final MPesaBalance[] newArray(int i) {
                return new MPesaBalance[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        private MPesaBalance() {
            super(null);
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    public PaymentMethod(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0012\u001a\u00020\u0013H\u0007J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H×\u0003J\t\u0010\u0018\u001a\u00020\u0013H×\u0001J\t\u0010\u0019\u001a\u00020\u001aH×\u0001J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0013H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, d2 = {"Lcom/safaricom/sharedui/compose/amountinput/PaymentMethod$BongaPoints;", "Lcom/safaricom/sharedui/compose/amountinput/PaymentMethod;", "bongaBalance", "", PESActivity.EXTRA_BONGA_POINTS, "", "conversionRate", "<init>", "(DJD)V", "getBongaBalance", "()D", "getBongaPoints", "()J", "getConversionRate", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BongaPoints extends PaymentMethod {
        public static final int $stable = 0;
        public static final Parcelable.Creator<BongaPoints> CREATOR = new Creator();
        private final double bongaBalance;
        private final long bongaPoints;
        private final double conversionRate;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BongaPoints> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final BongaPoints createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new BongaPoints(parcel.readDouble(), parcel.readLong(), parcel.readDouble());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final BongaPoints[] newArray(int i) {
                return new BongaPoints[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        public BongaPoints(double d2, long j, double d3) {
            super(null);
            this.bongaBalance = d2;
            this.bongaPoints = j;
            this.conversionRate = d3;
        }

        public final double getBongaBalance() {
            return this.bongaBalance;
        }

        public final long getBongaPoints() {
            return this.bongaPoints;
        }

        public final double getConversionRate() {
            return this.conversionRate;
        }

        public static BongaPoints copy$default(BongaPoints bongaPoints, double d2, long j, double d3, int i, Object obj) {
            if ((i & 1) != 0) {
                d2 = bongaPoints.bongaBalance;
            }
            double d4 = d2;
            if ((i & 2) != 0) {
                j = bongaPoints.bongaPoints;
            }
            long j2 = j;
            if ((i & 4) != 0) {
                d3 = bongaPoints.conversionRate;
            }
            return bongaPoints.copy(d4, j2, d3);
        }

        public final double getBongaBalance() {
            return this.bongaBalance;
        }

        public final long getBongaPoints() {
            return this.bongaPoints;
        }

        public final double getConversionRate() {
            return this.conversionRate;
        }

        public final BongaPoints copy(double bongaBalance, long bongaPoints, double conversionRate) {
            return new BongaPoints(bongaBalance, bongaPoints, conversionRate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BongaPoints)) {
                return false;
            }
            BongaPoints bongaPoints = (BongaPoints) other;
            return Double.compare(this.bongaBalance, bongaPoints.bongaBalance) == 0 && this.bongaPoints == bongaPoints.bongaPoints && Double.compare(this.conversionRate, bongaPoints.conversionRate) == 0;
        }

        public int hashCode() {
            return (((Double.hashCode(this.bongaBalance) * 31) + Long.hashCode(this.bongaPoints)) * 31) + Double.hashCode(this.conversionRate);
        }

        public String toString() {
            return "BongaPoints(bongaBalance=" + this.bongaBalance + ", bongaPoints=" + this.bongaPoints + ", conversionRate=" + this.conversionRate + ')';
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeDouble(this.bongaBalance);
            dest.writeLong(this.bongaPoints);
            dest.writeDouble(this.conversionRate);
        }
    }
}
