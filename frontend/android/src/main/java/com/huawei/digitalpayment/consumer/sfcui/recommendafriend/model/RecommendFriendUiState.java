package com.huawei.digitalpayment.consumer.sfcui.recommendafriend.model;

import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u000bHÆ\u0003JC\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÇ\u0001J\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001e\u001a\u00020\bH×\u0001J\t\u0010\u001f\u001a\u00020\u000bH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/recommendafriend/model/RecommendFriendUiState;", "", GriverMonitorConstants.KEY_IS_LOADING, "", "recommendedFriends", "", "Lcom/huawei/digitalpayment/consumer/sfcui/recommendafriend/model/RecommendedFriend;", "maxRecommendations", "", "limitReached", "error", "", "<init>", "(ZLjava/util/List;IZLjava/lang/String;)V", "()Z", "getRecommendedFriends", "()Ljava/util/List;", "getMaxRecommendations", "()I", "getLimitReached", "getError", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecommendFriendUiState {
    public static final int $stable = 8;
    private static int component4 = 1;
    private static int equals = 0;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState;
    private final boolean ShareDataUIState;
    private final List<RecommendedFriend> component1;
    private final int component2;
    private final String component3;
    private final boolean copydefault;

    public RecommendFriendUiState(boolean z, List<RecommendedFriend> list, int i, boolean z2, String str) {
        Intrinsics.checkNotNullParameter(list, "");
        this.ShareDataUIState = z;
        this.component1 = list;
        this.component2 = i;
        this.copydefault = z2;
        this.component3 = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RecommendFriendUiState(boolean z, List list, int i, boolean z2, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z3 = false;
        if ((i2 & 1) != 0) {
            int i3 = 2 % 2;
            z = false;
        }
        String str2 = null;
        if ((i2 & 2) != 0) {
            int i4 = getAsAtTimestamp + 47;
            equals = i4 % 128;
            if (i4 % 2 != 0) {
                CollectionsKt.emptyList();
                str2.hashCode();
                throw null;
            }
            list = CollectionsKt.emptyList();
        }
        List list2 = list;
        if ((i2 & 4) != 0) {
            int i5 = getAsAtTimestamp + 21;
            equals = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 5 / 2;
            } else {
                int i7 = 2 % 2;
            }
            i = 10;
        }
        int i8 = i;
        if ((i2 & 8) != 0) {
            int i9 = equals + 37;
            getAsAtTimestamp = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
        } else {
            z3 = z2;
        }
        if ((i2 & 16) != 0) {
            int i12 = equals + 111;
            getAsAtTimestamp = i12 % 128;
            int i13 = i12 % 2;
        } else {
            str2 = str;
        }
        this(z, list2, i8, z3, str2);
    }

    public final boolean isLoading() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 35;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        boolean z = this.ShareDataUIState;
        int i5 = i3 + 53;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final List<RecommendedFriend> getRecommendedFriends() {
        int i = 2 % 2;
        int i2 = equals + 101;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        List<RecommendedFriend> list = this.component1;
        int i5 = i3 + 15;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 84 / 0;
        }
        return list;
    }

    public final int getMaxRecommendations() {
        int i;
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 67;
        int i4 = i3 % 128;
        equals = i4;
        if (i3 % 2 != 0) {
            i = this.component2;
            int i5 = 7 / 0;
        } else {
            i = this.component2;
        }
        int i6 = i4 + 5;
        getAsAtTimestamp = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 64 / 0;
        }
        return i;
    }

    public final boolean getLimitReached() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 77;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        boolean z = this.copydefault;
        int i5 = i3 + 71;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final String getError() {
        String str;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 69;
        equals = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.component3;
            int i4 = 99 / 0;
        } else {
            str = this.component3;
        }
        int i5 = i2 + 59;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 26 / 0;
        }
        return str;
    }

    static {
        int i = 1 + 41;
        getRequestBeneficiariesState = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public RecommendFriendUiState() {
        this(false, null, 0, false, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static RecommendFriendUiState copy$default(RecommendFriendUiState recommendFriendUiState, boolean z, List list, int i, boolean z2, String str, int i2, Object obj) {
        int i3;
        int i4 = 2 % 2;
        if ((i2 & 1) != 0) {
            z = recommendFriendUiState.ShareDataUIState;
        }
        boolean z3 = z;
        if ((i2 & 2) != 0) {
            int i5 = getAsAtTimestamp + 1;
            equals = i5 % 128;
            int i6 = i5 % 2;
            list = recommendFriendUiState.component1;
        }
        List list2 = list;
        if ((i2 & 4) != 0) {
            int i7 = equals + 57;
            getAsAtTimestamp = i7 % 128;
            if (i7 % 2 == 0) {
                i3 = recommendFriendUiState.component2;
                int i8 = 89 / 0;
            } else {
                i3 = recommendFriendUiState.component2;
            }
            i = i3;
        }
        int i9 = i;
        if ((i2 & 8) != 0) {
            z2 = recommendFriendUiState.copydefault;
        }
        boolean z4 = z2;
        if ((i2 & 16) != 0) {
            int i10 = equals + 99;
            int i11 = i10 % 128;
            getAsAtTimestamp = i11;
            int i12 = i10 % 2;
            str = recommendFriendUiState.component3;
            int i13 = i11 + 57;
            equals = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 4 % 2;
            }
        }
        return recommendFriendUiState.copy(z3, list2, i9, z4, str);
    }

    public final boolean component1() {
        int i = 2 % 2;
        int i2 = equals + 55;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ShareDataUIState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<RecommendedFriend> component2() {
        List<RecommendedFriend> list;
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 67;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 == 0) {
            list = this.component1;
            int i4 = 56 / 0;
        } else {
            list = this.component1;
        }
        int i5 = i2 + 81;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final int component3() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 9;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        int i5 = this.component2;
        int i6 = i3 + 125;
        getAsAtTimestamp = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final boolean component4() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 99;
        equals = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.copydefault;
        int i5 = i2 + 35;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = equals + 83;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 47;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final RecommendFriendUiState copy(boolean isLoading, List<RecommendedFriend> recommendedFriends, int maxRecommendations, boolean limitReached, String error) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(recommendedFriends, "");
        RecommendFriendUiState recommendFriendUiState = new RecommendFriendUiState(isLoading, recommendedFriends, maxRecommendations, limitReached, error);
        int i2 = equals + 29;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return recommendFriendUiState;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 69;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            int i5 = i2 + 83;
            getAsAtTimestamp = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof RecommendFriendUiState)) {
            return false;
        }
        RecommendFriendUiState recommendFriendUiState = (RecommendFriendUiState) other;
        if (this.ShareDataUIState != recommendFriendUiState.ShareDataUIState) {
            int i7 = i2 + 85;
            getAsAtTimestamp = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component1, recommendFriendUiState.component1)) {
            int i9 = getAsAtTimestamp + 3;
            equals = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (this.component2 != recommendFriendUiState.component2) {
            int i11 = getAsAtTimestamp + 1;
            equals = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (this.copydefault == recommendFriendUiState.copydefault) {
            return Intrinsics.areEqual(this.component3, recommendFriendUiState.component3);
        }
        int i13 = getAsAtTimestamp + 95;
        equals = i13 % 128;
        return i13 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 111;
        equals = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = Boolean.hashCode(this.ShareDataUIState);
        int iHashCode3 = this.component1.hashCode();
        int iHashCode4 = Integer.hashCode(this.component2);
        int iHashCode5 = Boolean.hashCode(this.copydefault);
        String str = this.component3;
        if (str == null) {
            int i4 = getAsAtTimestamp + 97;
            equals = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RecommendFriendUiState(isLoading=" + this.ShareDataUIState + ", recommendedFriends=" + this.component1 + ", maxRecommendations=" + this.component2 + ", limitReached=" + this.copydefault + ", error=" + this.component3 + ")";
        int i2 = equals + 99;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
