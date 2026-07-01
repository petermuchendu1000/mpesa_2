package com.safaricom.consumer.commons.withdraw;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¨\u0006\u0003"}, d2 = {"mapToWithdrawType", "Lcom/safaricom/consumer/commons/withdraw/WithdrawType;", "", "ConsumerSfcCommons_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class WithdrawTypeKt {
    public static final WithdrawType mapToWithdrawType(String str) {
        return Intrinsics.areEqual(str, "EFT") ? WithdrawType.EFT : Intrinsics.areEqual(str, "RTS") ? WithdrawType.RTS : WithdrawType.UNDEFINED;
    }
}
