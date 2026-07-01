package com.huawei.digitalpayment.consumer.sfcui.profile.esim;

import androidx.autofill.HintConstants;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.huawei.digitalpayment.consumer.sfcui.profile.esim.api.model.ESimQueryBody;
import com.iap.ac.android.acs.plugin.utils.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\u0012\b\u0002\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u0013\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\nHÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u0012\b\u0002\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\nHÇ\u0001J\u0013\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001d\u001a\u00020\u001eH×\u0001J\t\u0010\u001f\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0011R\u001b\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/ESimUiState;", "", "phoneNumber", "", HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS, "isButtonEnabled", "", GriverMonitorConstants.KEY_IS_LOADING, "isReserveLoading", "previousRequests", "", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/api/model/ESimQueryBody;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZZLjava/util/List;)V", Constants.JS_API_GET_PHONE_NUMBER, "()Ljava/lang/String;", "getEmailAddress", "()Z", "getPreviousRequests", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ESimUiState {
    public static final int $stable = 8;
    private static int copy = 1;
    private static int equals = 1;
    private static int getAsAtTimestamp;
    private static int getRequestBeneficiariesState;
    private final String ShareDataUIState;
    private final boolean component1;
    private final boolean component2;
    private final boolean component3;
    private final List<ESimQueryBody> component4;
    private final String copydefault;

    public ESimUiState(String str, String str2, boolean z, boolean z2, boolean z3, List<ESimQueryBody> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault = str;
        this.ShareDataUIState = str2;
        this.component1 = z;
        this.component2 = z2;
        this.component3 = z3;
        this.component4 = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ESimUiState(String str, String str2, boolean z, boolean z2, boolean z3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z4;
        if ((i & 1) != 0) {
            int i2 = getRequestBeneficiariesState + 91;
            equals = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
            str = "";
        }
        String str3 = (i & 2) == 0 ? str2 : "";
        boolean z5 = false;
        if ((i & 4) != 0) {
            int i4 = getRequestBeneficiariesState + 7;
            equals = i4 % 128;
            if (i4 % 2 == 0) {
                z = true;
                z4 = z;
            } else {
                z4 = false;
            }
        } else {
            z4 = z;
        }
        boolean z6 = (i & 8) != 0 ? false : z2;
        if ((i & 16) != 0) {
            int i5 = equals + 109;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
        } else {
            z5 = z3;
        }
        this(str, str3, z4, z6, z5, (i & 32) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final String getPhoneNumber() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 13;
        equals = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copydefault;
        int i5 = i2 + 55;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getEmailAddress() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 103;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ShareDataUIState;
        }
        throw null;
    }

    public final boolean isButtonEnabled() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 89;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isLoading() {
        int i = 2 % 2;
        int i2 = equals + 79;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        boolean z = this.component2;
        int i5 = i3 + 111;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final boolean isReserveLoading() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 63;
        equals = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.component3;
        int i5 = i2 + 23;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final List<ESimQueryBody> getPreviousRequests() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 39;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = 1 + 95;
        getAsAtTimestamp = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ESimUiState() {
        this(null, null, false, false, false, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ESimUiState copy$default(ESimUiState eSimUiState, String str, String str2, boolean z, boolean z2, boolean z3, List list, int i, Object obj) {
        boolean z4;
        boolean z5;
        boolean z6;
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState;
        int i4 = i3 + 33;
        equals = i4 % 128;
        int i5 = i4 % 2;
        String str3 = (i & 1) != 0 ? eSimUiState.copydefault : str;
        String str4 = (i & 2) != 0 ? eSimUiState.ShareDataUIState : str2;
        if ((i & 4) != 0) {
            int i6 = i3 + 15;
            equals = i6 % 128;
            int i7 = i6 % 2;
            z4 = eSimUiState.component1;
        } else {
            z4 = z;
        }
        if ((i & 8) != 0) {
            int i8 = equals + 27;
            getRequestBeneficiariesState = i8 % 128;
            int i9 = i8 % 2;
            z5 = eSimUiState.component2;
        } else {
            z5 = z2;
        }
        if ((i & 16) != 0) {
            int i10 = equals + 33;
            getRequestBeneficiariesState = i10 % 128;
            int i11 = i10 % 2;
            z6 = eSimUiState.component3;
            if (i11 != 0) {
                int i12 = 44 / 0;
            }
        } else {
            z6 = z3;
        }
        return eSimUiState.copy(str3, str4, z4, z5, z6, (i & 32) != 0 ? eSimUiState.component4 : list);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = equals + 89;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.copydefault;
        if (i3 != 0) {
            int i4 = 23 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = equals + 123;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ShareDataUIState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component3() {
        int i = 2 % 2;
        int i2 = equals + 47;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        boolean z = this.component1;
        int i5 = i3 + 17;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 89 / 0;
        }
        return z;
    }

    public final boolean component4() {
        int i = 2 % 2;
        int i2 = equals + 87;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        boolean z = this.component2;
        int i5 = i3 + 43;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean component5() {
        boolean z;
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 39;
        int i3 = i2 % 128;
        equals = i3;
        if (i2 % 2 == 0) {
            z = this.component3;
            int i4 = 14 / 0;
        } else {
            z = this.component3;
        }
        int i5 = i3 + 13;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 92 / 0;
        }
        return z;
    }

    public final List<ESimQueryBody> component6() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 21;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<ESimQueryBody> list = this.component4;
        int i4 = i2 + 83;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final ESimUiState copy(String phoneNumber, String emailAddress, boolean isButtonEnabled, boolean isLoading, boolean isReserveLoading, List<ESimQueryBody> previousRequests) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(phoneNumber, "");
        Intrinsics.checkNotNullParameter(emailAddress, "");
        ESimUiState eSimUiState = new ESimUiState(phoneNumber, emailAddress, isButtonEnabled, isLoading, isReserveLoading, previousRequests);
        int i2 = getRequestBeneficiariesState + 3;
        equals = i2 % 128;
        int i3 = i2 % 2;
        return eSimUiState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof ESimUiState)) {
            int i2 = equals + 109;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        ESimUiState eSimUiState = (ESimUiState) other;
        if (!Intrinsics.areEqual(this.copydefault, eSimUiState.copydefault)) {
            int i4 = getRequestBeneficiariesState + 5;
            equals = i4 % 128;
            return !(i4 % 2 != 0);
        }
        if (!Intrinsics.areEqual(this.ShareDataUIState, eSimUiState.ShareDataUIState)) {
            int i5 = getRequestBeneficiariesState + 95;
            equals = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (this.component1 != eSimUiState.component1 || this.component2 != eSimUiState.component2) {
            return false;
        }
        if (this.component3 == eSimUiState.component3) {
            return Intrinsics.areEqual(this.component4, eSimUiState.component4);
        }
        int i7 = equals + 89;
        getRequestBeneficiariesState = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.copydefault.hashCode();
        int iHashCode3 = this.ShareDataUIState.hashCode();
        int iHashCode4 = Boolean.hashCode(this.component1);
        int iHashCode5 = Boolean.hashCode(this.component2);
        int iHashCode6 = Boolean.hashCode(this.component3);
        List<ESimQueryBody> list = this.component4;
        if (list == null) {
            int i2 = getRequestBeneficiariesState + 51;
            int i3 = i2 % 128;
            equals = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 41;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = list.hashCode();
        }
        return (((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ESimUiState(phoneNumber=" + this.copydefault + ", emailAddress=" + this.ShareDataUIState + ", isButtonEnabled=" + this.component1 + ", isLoading=" + this.component2 + ", isReserveLoading=" + this.component3 + ", previousRequests=" + this.component4 + ")";
        int i2 = equals + 91;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 13 / 0;
        }
        return str;
    }
}
