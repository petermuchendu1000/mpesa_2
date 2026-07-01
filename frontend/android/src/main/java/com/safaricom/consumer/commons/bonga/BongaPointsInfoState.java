package com.safaricom.consumer.commons.bonga;

import com.huawei.digitalpayment.consumer.sfcui.pesa.ui.PESActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/safaricom/consumer/commons/bonga/BongaPointsInfoState;", "", "<init>", "()V", "OptedIn", "NotOptedIn", "Error", "Loading", "Lcom/safaricom/consumer/commons/bonga/BongaPointsInfoState$Error;", "Lcom/safaricom/consumer/commons/bonga/BongaPointsInfoState$Loading;", "Lcom/safaricom/consumer/commons/bonga/BongaPointsInfoState$NotOptedIn;", "Lcom/safaricom/consumer/commons/bonga/BongaPointsInfoState$OptedIn;", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BongaPointsInfoState {

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/safaricom/consumer/commons/bonga/BongaPointsInfoState$OptedIn;", "Lcom/safaricom/consumer/commons/bonga/BongaPointsInfoState;", "bongaBalance", "", PESActivity.EXTRA_BONGA_POINTS, "", "conversionRate", "<init>", "(DJD)V", "getBongaBalance", "()D", "getBongaPoints", "()J", "getConversionRate", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OptedIn extends BongaPointsInfoState {
        private final long component1;
        private final double component2;
        private final double copydefault;

        public OptedIn(double d2, long j, double d3) {
            super(null);
            this.copydefault = d2;
            this.component1 = j;
            this.component2 = d3;
        }

        public final double getBongaBalance() {
            return this.copydefault;
        }

        public final long getBongaPoints() {
            return this.component1;
        }

        public final double getConversionRate() {
            return this.component2;
        }

        public static OptedIn copy$default(OptedIn optedIn, double d2, long j, double d3, int i, Object obj) {
            if ((i & 1) != 0) {
                d2 = optedIn.copydefault;
            }
            double d4 = d2;
            if ((i & 2) != 0) {
                j = optedIn.component1;
            }
            long j2 = j;
            if ((i & 4) != 0) {
                d3 = optedIn.component2;
            }
            return optedIn.copy(d4, j2, d3);
        }

        public final double getCopydefault() {
            return this.copydefault;
        }

        public final long getComponent1() {
            return this.component1;
        }

        public final double getComponent2() {
            return this.component2;
        }

        public final OptedIn copy(double bongaBalance, long bongaPoints, double conversionRate) {
            return new OptedIn(bongaBalance, bongaPoints, conversionRate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OptedIn)) {
                return false;
            }
            OptedIn optedIn = (OptedIn) other;
            return Double.compare(this.copydefault, optedIn.copydefault) == 0 && this.component1 == optedIn.component1 && Double.compare(this.component2, optedIn.component2) == 0;
        }

        public int hashCode() {
            return (((Double.hashCode(this.copydefault) * 31) + Long.hashCode(this.component1)) * 31) + Double.hashCode(this.component2);
        }

        public String toString() {
            return "OptedIn(bongaBalance=" + this.copydefault + ", bongaPoints=" + this.component1 + ", conversionRate=" + this.component2 + ')';
        }
    }

    private BongaPointsInfoState() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/safaricom/consumer/commons/bonga/BongaPointsInfoState$NotOptedIn;", "Lcom/safaricom/consumer/commons/bonga/BongaPointsInfoState;", "<init>", "()V", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NotOptedIn extends BongaPointsInfoState {
        public static final NotOptedIn INSTANCE = new NotOptedIn();

        private NotOptedIn() {
            super(null);
        }
    }

    public BongaPointsInfoState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/safaricom/consumer/commons/bonga/BongaPointsInfoState$Error;", "Lcom/safaricom/consumer/commons/bonga/BongaPointsInfoState;", "<init>", "()V", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Error extends BongaPointsInfoState {
        public static final Error INSTANCE = new Error();

        private Error() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/safaricom/consumer/commons/bonga/BongaPointsInfoState$Loading;", "Lcom/safaricom/consumer/commons/bonga/BongaPointsInfoState;", "<init>", "()V", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Loading extends BongaPointsInfoState {
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }
}
