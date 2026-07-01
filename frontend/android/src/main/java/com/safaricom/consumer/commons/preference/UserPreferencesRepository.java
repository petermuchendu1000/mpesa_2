package com.safaricom.consumer.commons.preference;

import com.safaricom.consumer.commons.util.TooltipType;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007J\u0006\u0010\f\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\u0005J\u0006\u0010\u000e\u001a\u00020\n¨\u0006\u000f"}, d2 = {"Lcom/safaricom/consumer/commons/preference/UserPreferencesRepository;", "", "<init>", "()V", "shouldShowTooltip", "", "tootipType", "Lcom/safaricom/consumer/commons/util/TooltipType;", "(Lcom/safaricom/consumer/commons/util/TooltipType;)Ljava/lang/Boolean;", "setTooltipShown", "", "multipleWallet", "incrementMultipleWalletTooltipTracker", "isFirstTimeOnBongaPointsSupportedScreen", "setFirstTimeOnBongaPointsSupportedScreen", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserPreferencesRepository {
    public final void incrementMultipleWalletTooltipTracker() {
    }

    public final boolean isFirstTimeOnBongaPointsSupportedScreen() {
        return false;
    }

    public final void setFirstTimeOnBongaPointsSupportedScreen() {
    }

    @Inject
    public UserPreferencesRepository() {
    }

    public final void setTooltipShown(TooltipType multipleWallet) {
        Intrinsics.checkNotNullParameter(multipleWallet, "");
    }

    public final Boolean shouldShowTooltip(TooltipType tootipType) {
        Intrinsics.checkNotNullParameter(tootipType, "");
        return null;
    }
}
