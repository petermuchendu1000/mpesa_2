package com.huawei.digitalpayment.consumer.sfcui.buybundles.spotify.spotifyBundlesConfirm;

import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.spotify.model.SpotifyBundleData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÇ\u0001J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001a\u001a\u00020\u001bH×\u0001J\t\u0010\u001c\u001a\u00020\bH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/spotify/spotifyBundlesConfirm/SpotifyBundlesConfirmState;", "", "isError", "", GriverMonitorConstants.KEY_IS_LOADING, "bundleData", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/spotify/model/SpotifyBundleData;", "errorMessage", "", "msisdn", "<init>", "(ZZLcom/huawei/digitalpayment/consumer/sfcui/buybundles/spotify/model/SpotifyBundleData;Ljava/lang/String;Ljava/lang/String;)V", "()Z", "getBundleData", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/spotify/model/SpotifyBundleData;", "getErrorMessage", "()Ljava/lang/String;", "getMsisdn", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SpotifyBundlesConfirmState {
    public static final int $stable = 0;
    private static int copy = 0;
    private static int equals = 1;
    private static int getAsAtTimestamp = 37 % 128;
    private static int getRequestBeneficiariesState;
    private final boolean ShareDataUIState;
    private final boolean component1;
    private final String component2;
    private final SpotifyBundleData component3;
    private final String copydefault;

    public SpotifyBundlesConfirmState(boolean z, boolean z2, SpotifyBundleData spotifyBundleData, String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.ShareDataUIState = z;
        this.component1 = z2;
        this.component3 = spotifyBundleData;
        this.component2 = str;
        this.copydefault = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SpotifyBundlesConfirmState(boolean z, boolean z2, SpotifyBundleData spotifyBundleData, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z3;
        String str3;
        boolean z4 = (i & 1) != 0 ? false : z;
        if ((i & 2) != 0) {
            int i2 = equals + 77;
            copy = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            z3 = false;
        } else {
            z3 = z2;
        }
        if ((i & 4) != 0) {
            int i5 = copy + 29;
            equals = i5 % 128;
            spotifyBundleData = null;
            if (i5 % 2 == 0) {
                int i6 = 69 / 0;
            }
        }
        SpotifyBundleData spotifyBundleData2 = spotifyBundleData;
        if ((i & 8) != 0) {
            int i7 = 2 % 2;
            str3 = "";
        } else {
            str3 = str;
        }
        this(z4, z3, spotifyBundleData2, str3, (i & 16) != 0 ? "" : str2);
    }

    public final boolean isError() {
        int i = 2 % 2;
        int i2 = equals + 17;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ShareDataUIState;
        }
        throw null;
    }

    public final boolean isLoading() {
        int i = 2 % 2;
        int i2 = equals + 9;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        boolean z = this.component1;
        int i5 = i3 + 77;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final SpotifyBundleData getBundleData() {
        int i = 2 % 2;
        int i2 = equals + 73;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component3;
        }
        throw null;
    }

    public final String getErrorMessage() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 63;
        copy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 89;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = equals + 101;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 7;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        if (37 % 2 == 0) {
            int i = 55 / 0;
        }
    }

    public SpotifyBundlesConfirmState() {
        this(false, false, null, null, null, 31, null);
    }

    public static SpotifyBundlesConfirmState copy$default(SpotifyBundlesConfirmState spotifyBundlesConfirmState, boolean z, boolean z2, SpotifyBundleData spotifyBundleData, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = equals + 79;
            copy = i3 % 128;
            if (i3 % 2 != 0) {
                boolean z3 = spotifyBundlesConfirmState.ShareDataUIState;
                throw null;
            }
            z = spotifyBundlesConfirmState.ShareDataUIState;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            z2 = spotifyBundlesConfirmState.component1;
            int i4 = copy + 11;
            equals = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 5;
            }
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            spotifyBundleData = spotifyBundlesConfirmState.component3;
        }
        SpotifyBundleData spotifyBundleData2 = spotifyBundleData;
        if ((i & 8) != 0) {
            str = spotifyBundlesConfirmState.component2;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            str2 = spotifyBundlesConfirmState.copydefault;
        }
        return spotifyBundlesConfirmState.copy(z4, z5, spotifyBundleData2, str3, str2);
    }

    public final boolean component1() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 123;
        copy = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.ShareDataUIState;
        int i5 = i2 + 85;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean component2() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 79;
        copy = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        boolean z = this.component1;
        int i4 = i2 + 81;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final SpotifyBundleData component3() {
        int i = 2 % 2;
        int i2 = copy + 77;
        equals = i2 % 128;
        int i3 = i2 % 2;
        SpotifyBundleData spotifyBundleData = this.component3;
        if (i3 == 0) {
            int i4 = 46 / 0;
        }
        return spotifyBundleData;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = equals + 85;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        String str = this.component2;
        int i5 = i3 + 85;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 47 / 0;
        }
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = copy + 103;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 31;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final SpotifyBundlesConfirmState copy(boolean isError, boolean isLoading, SpotifyBundleData bundleData, String errorMessage, String msisdn) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(errorMessage, "");
        Intrinsics.checkNotNullParameter(msisdn, "");
        SpotifyBundlesConfirmState spotifyBundlesConfirmState = new SpotifyBundlesConfirmState(isError, isLoading, bundleData, errorMessage, msisdn);
        int i2 = copy + 107;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 86 / 0;
        }
        return spotifyBundlesConfirmState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 33;
        equals = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpotifyBundlesConfirmState)) {
            return false;
        }
        SpotifyBundlesConfirmState spotifyBundlesConfirmState = (SpotifyBundlesConfirmState) other;
        if (this.ShareDataUIState != spotifyBundlesConfirmState.ShareDataUIState) {
            return false;
        }
        if (this.component1 != spotifyBundlesConfirmState.component1) {
            int i4 = i2 + 99;
            equals = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component3, spotifyBundlesConfirmState.component3) || !Intrinsics.areEqual(this.component2, spotifyBundlesConfirmState.component2) || (!Intrinsics.areEqual(this.copydefault, spotifyBundlesConfirmState.copydefault))) {
            return false;
        }
        int i6 = copy + 113;
        equals = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 71 / 0;
        }
        return true;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = copy + 65;
        equals = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = Boolean.hashCode(this.ShareDataUIState);
        int iHashCode3 = Boolean.hashCode(this.component1);
        SpotifyBundleData spotifyBundleData = this.component3;
        if (spotifyBundleData == null) {
            int i4 = equals + 19;
            int i5 = i4 % 128;
            copy = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 53;
            equals = i7 % 128;
            int i8 = i7 % 2;
            iHashCode = 0;
        } else {
            iHashCode = spotifyBundleData.hashCode();
        }
        return (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + this.component2.hashCode()) * 31) + this.copydefault.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SpotifyBundlesConfirmState(isError=" + this.ShareDataUIState + ", isLoading=" + this.component1 + ", bundleData=" + this.component3 + ", errorMessage=" + this.component2 + ", msisdn=" + this.copydefault + ")";
        int i2 = copy + 97;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 93 / 0;
        }
        return str;
    }
}
