package com.huawei.digitalpayment.consumer.sfcui.profile.manageline.resp;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003JG\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÇ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001b\u001a\u00020\u001cH×\u0001J\t\u0010\u001d\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/manageline/resp/UpdateKYCPayload;", "", "docId", "", "documentSerialNo", "ignoredMsisdn", "", "msisdn", "selectedMsisdn", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "getDocId", "()Ljava/lang/String;", "getDocumentSerialNo", "getIgnoredMsisdn", "()Ljava/util/List;", "getMsisdn", "getSelectedMsisdn", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UpdateKYCPayload {
    public static final int $stable = 8;
    private static int component4 = 0;
    private static int copy = 1;
    private static int equals = 0;
    private static int getAsAtTimestamp = 1;

    @SerializedName("ignoredMsisdn")
    private final List<String> ShareDataUIState;

    @SerializedName("selectedMsisdn")
    private final List<String> component1;

    @SerializedName("documentSerialNo")
    private final String component2;

    @SerializedName("docId")
    private final String component3;

    @SerializedName("msisdn")
    private final String copydefault;

    public UpdateKYCPayload(String str, String str2, List<String> list, String str3, List<String> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.component3 = str;
        this.component2 = str2;
        this.ShareDataUIState = list;
        this.copydefault = str3;
        this.component1 = list2;
    }

    public final String getDocId() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 61;
        copy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component3;
        int i5 = i2 + 25;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 31 / 0;
        }
        return str;
    }

    public final String getDocumentSerialNo() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 49;
        equals = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 117;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<String> getIgnoredMsisdn() {
        int i = 2 % 2;
        int i2 = copy + 87;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        List<String> list = this.ShareDataUIState;
        int i5 = i3 + 57;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = equals + 5;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 91;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<String> getSelectedMsisdn() {
        int i = 2 % 2;
        int i2 = equals + 59;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component1;
        }
        throw null;
    }

    static {
        int i = 1 + 97;
        component4 = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static UpdateKYCPayload copy$default(UpdateKYCPayload updateKYCPayload, String str, String str2, List list, String str3, List list2, int i, Object obj) {
        String str4;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = updateKYCPayload.component3;
        }
        String str5 = str;
        if ((i & 2) != 0) {
            int i3 = equals + 99;
            int i4 = i3 % 128;
            copy = i4;
            int i5 = i3 % 2;
            String str6 = updateKYCPayload.component2;
            int i6 = i4 + 83;
            equals = i6 % 128;
            int i7 = i6 % 2;
            str4 = str6;
        } else {
            str4 = str2;
        }
        if ((i & 4) != 0) {
            list = updateKYCPayload.ShareDataUIState;
        }
        List list3 = list;
        if ((i & 8) != 0) {
            str3 = updateKYCPayload.copydefault;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            int i8 = equals + 55;
            copy = i8 % 128;
            int i9 = i8 % 2;
            list2 = updateKYCPayload.component1;
        }
        return updateKYCPayload.copy(str5, str4, list3, str7, list2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 125;
        copy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component3;
        int i5 = i2 + 105;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        String str;
        int i = 2 % 2;
        int i2 = copy + 21;
        int i3 = i2 % 128;
        equals = i3;
        if (i2 % 2 != 0) {
            str = this.component2;
            int i4 = 87 / 0;
        } else {
            str = this.component2;
        }
        int i5 = i3 + 85;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<String> component3() {
        List<String> list;
        int i = 2 % 2;
        int i2 = equals + 21;
        int i3 = i2 % 128;
        copy = i3;
        if (i2 % 2 == 0) {
            list = this.ShareDataUIState;
            int i4 = 37 / 0;
        } else {
            list = this.ShareDataUIState;
        }
        int i5 = i3 + 85;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = equals + 73;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 49;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<String> component5() {
        int i = 2 % 2;
        int i2 = equals + 27;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        List<String> list = this.component1;
        int i5 = i3 + 31;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final UpdateKYCPayload copy(String docId, String documentSerialNo, List<String> ignoredMsisdn, String msisdn, List<String> selectedMsisdn) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(docId, "");
        Intrinsics.checkNotNullParameter(documentSerialNo, "");
        Intrinsics.checkNotNullParameter(ignoredMsisdn, "");
        Intrinsics.checkNotNullParameter(msisdn, "");
        Intrinsics.checkNotNullParameter(selectedMsisdn, "");
        UpdateKYCPayload updateKYCPayload = new UpdateKYCPayload(docId, documentSerialNo, ignoredMsisdn, msisdn, selectedMsisdn);
        int i2 = equals + 61;
        copy = i2 % 128;
        int i3 = i2 % 2;
        return updateKYCPayload;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = equals + 71;
            copy = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(other instanceof UpdateKYCPayload)) {
            return false;
        }
        UpdateKYCPayload updateKYCPayload = (UpdateKYCPayload) other;
        if (!Intrinsics.areEqual(this.component3, updateKYCPayload.component3) || !Intrinsics.areEqual(this.component2, updateKYCPayload.component2)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.ShareDataUIState, updateKYCPayload.ShareDataUIState)) {
            int i3 = copy + 23;
            equals = i3 % 128;
            return i3 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.copydefault, updateKYCPayload.copydefault)) {
            return Intrinsics.areEqual(this.component1, updateKYCPayload.component1);
        }
        int i4 = equals + 17;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copy + 65;
        equals = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.component3.hashCode() * 31) + this.component2.hashCode()) * 31) + this.ShareDataUIState.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.component1.hashCode();
        int i4 = equals + 119;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UpdateKYCPayload(docId=" + this.component3 + ", documentSerialNo=" + this.component2 + ", ignoredMsisdn=" + this.ShareDataUIState + ", msisdn=" + this.copydefault + ", selectedMsisdn=" + this.component1 + ")";
        int i2 = copy + 27;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
