package com.safaricom.consumer.commons.remote;

import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.sfcui.constants.Constants;
import com.huawei.digitalpayment.consumer.sfcui.profile.manageline.SimConstants;
import com.huawei.digitalpayment.history.model.response.TransactionHistoryDetailResponse;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/safaricom/consumer/commons/remote/GlobalServerStatus;", "", "<init>", "(Ljava/lang/String;I)V", Constants.COMPLETED, SimConstants.STATUS_PENDING, "IN_PROGRESS", "FALLBACK", "UNKNOWN", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GlobalServerStatus {
    private static final EnumEntries $ENTRIES;
    private static final GlobalServerStatus[] $VALUES;

    @SerializedName(alternate = {TransactionHistoryDetailResponse.COMPLETED}, value = Constants.COMPLETED)
    public static final GlobalServerStatus COMPLETED = new GlobalServerStatus(Constants.COMPLETED, 0);

    @SerializedName(alternate = {"Pending"}, value = SimConstants.STATUS_PENDING)
    public static final GlobalServerStatus PENDING = new GlobalServerStatus(SimConstants.STATUS_PENDING, 1);

    @SerializedName(alternate = {"In Progress"}, value = "IN_PROGRESS")
    public static final GlobalServerStatus IN_PROGRESS = new GlobalServerStatus("IN_PROGRESS", 2);

    @SerializedName(alternate = {"Fallback"}, value = "FALLBACK")
    public static final GlobalServerStatus FALLBACK = new GlobalServerStatus("FALLBACK", 3);
    public static final GlobalServerStatus UNKNOWN = new GlobalServerStatus("UNKNOWN", 4);

    private GlobalServerStatus(String str, int i) {
    }

    static {
        GlobalServerStatus[] globalServerStatusArr$values = $values();
        $VALUES = globalServerStatusArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(globalServerStatusArr$values);
    }

    public static GlobalServerStatus valueOf(String str) {
        return (GlobalServerStatus) Enum.valueOf(GlobalServerStatus.class, str);
    }

    public static GlobalServerStatus[] values() {
        return (GlobalServerStatus[]) $VALUES.clone();
    }

    private static final GlobalServerStatus[] $values() {
        return new GlobalServerStatus[]{COMPLETED, PENDING, IN_PROGRESS, FALLBACK, UNKNOWN};
    }

    public static EnumEntries<GlobalServerStatus> getEntries() {
        return $ENTRIES;
    }
}
