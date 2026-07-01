package com.huawei.digitalpayment.consumer.base.sim;

import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0014R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/sim/SIMCard;", "", GriverCacheDao.COLUMN_CACHE_ID, "", "carrierName", "", "displayName", "operatorCode", "isEsim", "", "isDataSim", "isPhoneVoiceSim", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V", "getId", "()I", "getCarrierName", "()Ljava/lang/String;", "getDisplayName", "getOperatorCode", "()Z", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SIMCard {
    private static int component4 = 0;
    private static int getAsAtTimestamp = 1;
    private final String ShareDataUIState;
    private final int component1;
    private final boolean component2;
    private final String component3;
    private final boolean copydefault;
    private final String equals;
    private final boolean getRequestBeneficiariesState;

    public SIMCard(int i, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.component1 = i;
        this.component3 = str;
        this.ShareDataUIState = str2;
        this.equals = str3;
        this.component2 = z;
        this.copydefault = z2;
        this.getRequestBeneficiariesState = z3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SIMCard(int i, String str, String str2, String str3, boolean z, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z4;
        boolean z5;
        boolean z6;
        if ((i2 & 1) != 0) {
            int i3 = 2 % 2;
            i = -1;
        }
        String str4 = "";
        String str5 = (i2 & 2) != 0 ? "" : str;
        String str6 = (i2 & 4) != 0 ? "" : str2;
        if ((i2 & 8) != 0) {
            int i4 = component4 + 5;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } else {
            str4 = str3;
        }
        if ((i2 & 16) != 0) {
            int i7 = 2 % 2;
            z4 = false;
        } else {
            z4 = z;
        }
        if ((i2 & 32) != 0) {
            int i8 = component4 + 75;
            getAsAtTimestamp = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            z5 = false;
        } else {
            z5 = z2;
        }
        if ((i2 & 64) != 0) {
            int i11 = getAsAtTimestamp + 117;
            component4 = i11 % 128;
            int i12 = i11 % 2;
            z6 = false;
        } else {
            z6 = z3;
        }
        this(i, str5, str6, str4, z4, z5, z6);
    }

    public final int getId() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 61;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.component1;
        int i6 = i2 + 73;
        getAsAtTimestamp = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String getCarrierName() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 55;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 5;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getDisplayName() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 49;
        int i3 = i2 % 128;
        component4 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.ShareDataUIState;
        int i4 = i3 + 53;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getOperatorCode() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 79;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.equals;
        int i5 = i2 + 13;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isEsim() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 19;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.component2;
        if (i3 != 0) {
            int i4 = 4 / 0;
        }
        return z;
    }

    public final boolean isDataSim() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 93;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.copydefault;
        if (i3 != 0) {
            int i4 = 15 / 0;
        }
        return z;
    }

    public final boolean isPhoneVoiceSim() {
        boolean z;
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 105;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 == 0) {
            z = this.getRequestBeneficiariesState;
            int i4 = 17 / 0;
        } else {
            z = this.getRequestBeneficiariesState;
        }
        int i5 = i2 + 79;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public SIMCard() {
        this(0, null, null, null, false, false, false, 127, null);
    }
}
