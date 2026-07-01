package com.safaricom.consumer.commons.remote;

import com.huawei.digitalpayment.consumer.sfcui.profile.manageline.SimConstants;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¨\u0006\u0003"}, d2 = {"isPendingStatus", "", "", "ConsumerSfcCommons_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class GlobalServerStatusKt {
    public static final boolean isPendingStatus(String str) {
        return CollectionsKt.contains(CollectionsKt.listOf((Object[]) new String[]{SimConstants.STATUS_PENDING, "IN_PROGRESS"}), str);
    }
}
