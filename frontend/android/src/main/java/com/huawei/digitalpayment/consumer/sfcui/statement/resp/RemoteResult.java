package com.huawei.digitalpayment.consumer.sfcui.statement.resp;

import com.safaricom.consumer.commons.statements.Statement;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÇ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0019\u001a\u00020\u001aH×\u0001J\t\u0010\u001b\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/RemoteResult;", "", "detailedMsg", "", "referenceID", "responseCode", "responseData", "", "Lcom/safaricom/consumer/commons/statements/Statement;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getDetailedMsg", "()Ljava/lang/String;", "getReferenceID", "getResponseCode", "getResponseData", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RemoteResult {
    public static final int $stable = 8;
    private static int component3 = 0;
    private static int component4 = 1;
    private static int equals = 1;
    private static int getRequestBeneficiariesState;
    private final List<Statement> ShareDataUIState;
    private final String component1;
    private final String component2;
    private final String copydefault;

    public RemoteResult(String str, String str2, String str3, List<Statement> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.component2 = str;
        this.component1 = str2;
        this.copydefault = str3;
        this.ShareDataUIState = list;
    }

    public final String getDetailedMsg() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 103;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component2;
        }
        throw null;
    }

    public final String getReferenceID() {
        int i = 2 % 2;
        int i2 = component4 + 99;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.component1;
        int i4 = i3 + 73;
        component4 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String getResponseCode() {
        int i = 2 % 2;
        int i2 = component4 + 3;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 37;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<Statement> getResponseData() {
        int i = 2 % 2;
        int i2 = component4 + 43;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        List<Statement> list = this.ShareDataUIState;
        int i5 = i3 + 41;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    static {
        int i = 1 + 65;
        component3 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static RemoteResult copy$default(RemoteResult remoteResult, String str, String str2, String str3, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState;
        int i4 = i3 + 31;
        component4 = i4 % 128;
        if (i4 % 2 != 0 && (i & 1) != 0) {
            str = remoteResult.component2;
        }
        if ((i & 2) != 0) {
            str2 = remoteResult.component1;
        }
        if ((i & 4) != 0) {
            int i5 = i3 + 123;
            component4 = i5 % 128;
            int i6 = i5 % 2;
            str3 = remoteResult.copydefault;
        }
        if ((i & 8) != 0) {
            list = remoteResult.ShareDataUIState;
            int i7 = component4 + 57;
            getRequestBeneficiariesState = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 3 % 3;
            }
        }
        return remoteResult.copy(str, str2, str3, list);
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 95;
        component4 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.component2;
            int i4 = 80 / 0;
        } else {
            str = this.component2;
        }
        int i5 = i2 + 61;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 52 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 67;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 97;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 70 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 89;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copydefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<Statement> component4() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 59;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        List<Statement> list = this.ShareDataUIState;
        int i5 = i2 + 85;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final RemoteResult copy(String detailedMsg, String referenceID, String responseCode, List<Statement> responseData) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(detailedMsg, "");
        Intrinsics.checkNotNullParameter(referenceID, "");
        Intrinsics.checkNotNullParameter(responseCode, "");
        Intrinsics.checkNotNullParameter(responseData, "");
        RemoteResult remoteResult = new RemoteResult(detailedMsg, referenceID, responseCode, responseData);
        int i2 = component4 + 121;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        return remoteResult;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteResult)) {
            return false;
        }
        RemoteResult remoteResult = (RemoteResult) other;
        if (!Intrinsics.areEqual(this.component2, remoteResult.component2)) {
            int i2 = getRequestBeneficiariesState + 43;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component1, remoteResult.component1)) {
            return false;
        }
        if (Intrinsics.areEqual(this.copydefault, remoteResult.copydefault)) {
            return Intrinsics.areEqual(this.ShareDataUIState, remoteResult.ShareDataUIState);
        }
        int i4 = getRequestBeneficiariesState;
        int i5 = i4 + 1;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 113;
        component4 = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 45 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component4 + 21;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.component2.hashCode();
        return i3 != 0 ? (((((iHashCode - 118) / this.component1.hashCode()) % 37) + this.copydefault.hashCode()) << 97) / this.ShareDataUIState.hashCode() : (((((iHashCode * 31) + this.component1.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.ShareDataUIState.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RemoteResult(detailedMsg=" + this.component2 + ", referenceID=" + this.component1 + ", responseCode=" + this.copydefault + ", responseData=" + this.ShareDataUIState + ")";
        int i2 = getRequestBeneficiariesState + 21;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
