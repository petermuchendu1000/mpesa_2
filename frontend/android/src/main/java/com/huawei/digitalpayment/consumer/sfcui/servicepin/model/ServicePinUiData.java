package com.huawei.digitalpayment.consumer.sfcui.servicepin.model;

import com.huawei.digitalpayment.consumer.identity.ui.activity.CheckIdentityActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JU\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÇ\u0001J\u0013\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001f\u001a\u00020 H×\u0001J\t\u0010!\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014¨\u0006\""}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/servicepin/model/ServicePinUiData;", "", CheckIdentityActivity.ID_NUMBER, "", "idNumberError", "servicePin", "servicePinError", "confirmServicePin", "confirmServicePinError", "isButtonEnabled", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getIdNumber", "()Ljava/lang/String;", "getIdNumberError", "getServicePin", "getServicePinError", "getConfirmServicePin", "getConfirmServicePinError", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ServicePinUiData {
    public static final int $stable = 0;
    private static int copy = 0;
    private static int equals = 1;
    private static int getRequestBeneficiariesState = 0;
    private static int getShareableDataState = 1;
    private final String ShareDataUIState;
    private final String component1;
    private final String component2;
    private final String component3;
    private final String component4;
    private final boolean copydefault;
    private final String getAsAtTimestamp;

    public ServicePinUiData(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.component1 = str;
        this.ShareDataUIState = str2;
        this.getAsAtTimestamp = str3;
        this.component4 = str4;
        this.component3 = str5;
        this.component2 = str6;
        this.copydefault = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ServicePinUiData(String str, String str2, String str3, String str4, String str5, String str6, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str7;
        String str8 = (i & 1) != 0 ? "" : str;
        String str9 = null;
        String str10 = (i & 2) != 0 ? null : str2;
        String str11 = (i & 4) != 0 ? "" : str3;
        if ((i & 8) != 0) {
            int i2 = getShareableDataState + 119;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str7 = null;
        } else {
            str7 = str4;
        }
        String str12 = (i & 16) == 0 ? str5 : "";
        if ((i & 32) != 0) {
            int i5 = getRequestBeneficiariesState + 61;
            getShareableDataState = i5 % 128;
            if (i5 % 2 == 0) {
                str9.hashCode();
                throw null;
            }
        } else {
            str9 = str6;
        }
        if ((i & 64) != 0) {
            int i6 = getShareableDataState + 35;
            getRequestBeneficiariesState = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            z = false;
        }
        this(str8, str10, str11, str7, str12, str9, z);
    }

    public final String getIdNumber() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 59;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component1;
        if (i3 != 0) {
            int i4 = 15 / 0;
        }
        return str;
    }

    public final String getIdNumberError() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 83;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ShareDataUIState;
        int i5 = i2 + 43;
        getShareableDataState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getServicePin() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 77;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = this.getAsAtTimestamp;
        int i5 = i3 + 75;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getServicePinError() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 11;
        getShareableDataState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getConfirmServicePin() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 35;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 39;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getConfirmServicePinError() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 43;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component2;
        if (i3 == 0) {
            int i4 = 25 / 0;
        }
        return str;
    }

    public final boolean isButtonEnabled() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 25;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        boolean z = this.copydefault;
        int i5 = i3 + 7;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    static {
        int i = 1 + 47;
        copy = i % 128;
        int i2 = i % 2;
    }

    public ServicePinUiData() {
        this(null, null, null, null, null, null, false, 127, null);
    }

    public static ServicePinUiData copy$default(ServicePinUiData servicePinUiData, String str, String str2, String str3, String str4, String str5, String str6, boolean z, int i, Object obj) {
        String str7;
        String str8;
        boolean z2;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str7 = servicePinUiData.component1;
            int i3 = getRequestBeneficiariesState + 91;
            getShareableDataState = i3 % 128;
            int i4 = i3 % 2;
        } else {
            str7 = str;
        }
        String str9 = (i & 2) != 0 ? servicePinUiData.ShareDataUIState : str2;
        String str10 = (i & 4) != 0 ? servicePinUiData.getAsAtTimestamp : str3;
        String str11 = (i & 8) != 0 ? servicePinUiData.component4 : str4;
        if ((i & 16) != 0) {
            str8 = servicePinUiData.component3;
            int i5 = getRequestBeneficiariesState + 63;
            getShareableDataState = i5 % 128;
            int i6 = i5 % 2;
        } else {
            str8 = str5;
        }
        String str12 = (i & 32) != 0 ? servicePinUiData.component2 : str6;
        if ((i & 64) != 0) {
            int i7 = getRequestBeneficiariesState;
            int i8 = i7 + 3;
            getShareableDataState = i8 % 128;
            int i9 = i8 % 2;
            z2 = servicePinUiData.copydefault;
            int i10 = i7 + 3;
            getShareableDataState = i10 % 128;
            int i11 = i10 % 2;
        } else {
            z2 = z;
        }
        return servicePinUiData.copy(str7, str9, str10, str11, str8, str12, z2);
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 27;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.component1;
            int i4 = 87 / 0;
        } else {
            str = this.component1;
        }
        int i5 = i2 + 73;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 103;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ShareDataUIState;
        int i5 = i2 + 3;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 9;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.getAsAtTimestamp;
        int i5 = i2 + 39;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 27;
        getShareableDataState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 71;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 13;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 3 / 0;
        }
        return str;
    }

    public final String component6() {
        String str;
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 41;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.component2;
            int i4 = 95 / 0;
        } else {
            str = this.component2;
        }
        int i5 = i2 + 57;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean component7() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 73;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        boolean z = this.copydefault;
        int i5 = i3 + 117;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final ServicePinUiData copy(String idNumber, String idNumberError, String servicePin, String servicePinError, String confirmServicePin, String confirmServicePinError, boolean isButtonEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(idNumber, "");
        Intrinsics.checkNotNullParameter(servicePin, "");
        Intrinsics.checkNotNullParameter(confirmServicePin, "");
        ServicePinUiData servicePinUiData = new ServicePinUiData(idNumber, idNumberError, servicePin, servicePinError, confirmServicePin, confirmServicePinError, isButtonEnabled);
        int i2 = getRequestBeneficiariesState + 31;
        getShareableDataState = i2 % 128;
        if (i2 % 2 != 0) {
            return servicePinUiData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 61;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServicePinUiData)) {
            int i4 = i3 + 49;
            getShareableDataState = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        ServicePinUiData servicePinUiData = (ServicePinUiData) other;
        if (!Intrinsics.areEqual(this.component1, servicePinUiData.component1)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.ShareDataUIState, servicePinUiData.ShareDataUIState)) {
            int i6 = getShareableDataState + 67;
            getRequestBeneficiariesState = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.getAsAtTimestamp, servicePinUiData.getAsAtTimestamp)) {
            int i8 = getShareableDataState + 111;
            getRequestBeneficiariesState = i8 % 128;
            return i8 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.component4, servicePinUiData.component4)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.component3, servicePinUiData.component3)) {
            int i9 = getRequestBeneficiariesState + 109;
            getShareableDataState = i9 % 128;
            return i9 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.component2, servicePinUiData.component2)) {
            return false;
        }
        if (this.copydefault == servicePinUiData.copydefault) {
            return true;
        }
        int i10 = getShareableDataState + 55;
        getRequestBeneficiariesState = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = this.component1.hashCode();
        String str = this.ShareDataUIState;
        if (str == null) {
            int i2 = getRequestBeneficiariesState + 41;
            getShareableDataState = i2 % 128;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iHashCode4 = this.getAsAtTimestamp.hashCode();
        String str2 = this.component4;
        if (str2 == null) {
            int i3 = getShareableDataState + 27;
            getRequestBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
            int i5 = getShareableDataState + 57;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
        }
        int iHashCode5 = this.component3.hashCode();
        String str3 = this.component2;
        int iHashCode6 = (((((((((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode4) * 31) + iHashCode2) * 31) + iHashCode5) * 31) + (str3 == null ? 0 : str3.hashCode())) * 31) + Boolean.hashCode(this.copydefault);
        int i7 = getShareableDataState + 71;
        getRequestBeneficiariesState = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 24 / 0;
        }
        return iHashCode6;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ServicePinUiData(idNumber=" + this.component1 + ", idNumberError=" + this.ShareDataUIState + ", servicePin=" + this.getAsAtTimestamp + ", servicePinError=" + this.component4 + ", confirmServicePin=" + this.component3 + ", confirmServicePinError=" + this.component2 + ", isButtonEnabled=" + this.copydefault + ")";
        int i2 = getRequestBeneficiariesState + 15;
        getShareableDataState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 16 / 0;
        }
        return str;
    }
}
