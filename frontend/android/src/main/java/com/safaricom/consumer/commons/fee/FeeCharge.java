package com.safaricom.consumer.commons.fee;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/safaricom/consumer/commons/fee/FeeCharge;", "", "maxAmount", "", "getMaxAmount", "()D", "getFee", "amount", "Companion", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface FeeCharge {

    public static final Companion INSTANCE = Companion.copydefault;
    public static final double UNLIMITED = -1.0d;

    double getFee(double amount);

    double getMaxAmount();

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/safaricom/consumer/commons/fee/FeeCharge$Companion;", "", "<init>", "()V", "UNLIMITED", "", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static final double UNLIMITED = -1.0d;
        static final Companion copydefault = new Companion();

        private Companion() {
        }
    }
}
