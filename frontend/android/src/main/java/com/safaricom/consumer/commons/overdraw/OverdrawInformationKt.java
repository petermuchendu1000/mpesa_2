package com.safaricom.consumer.commons.overdraw;

import kotlin.Metadata;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\f\u0010\u0003\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¨\u0006\u0004"}, d2 = {"isActive", "", "Lcom/safaricom/consumer/commons/overdraw/OverdrawInformation;", "isNotEligible", "ConsumerSfcCommons_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class OverdrawInformationKt {
    public static final boolean isActive(OverdrawInformation overdrawInformation) {
        return overdrawInformation != null && StringsKt.equals("ACTIVE", overdrawInformation.getStatus(), true);
    }

    public static final boolean isNotEligible(OverdrawInformation overdrawInformation) {
        return overdrawInformation != null && StringsKt.equals("NOT_ELIGIBLE", overdrawInformation.getStatus(), true);
    }
}
