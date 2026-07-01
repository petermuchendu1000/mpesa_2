package com.huawei.digitalpayment.consumer.pochiwallet.ui.fuliza.resp;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/fuliza/resp/FulizaStatementReponse;", "Ljava/io/Serializable;", "ServiceResponse", "Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/fuliza/resp/StatementServiceResponse;", "<init>", "(Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/fuliza/resp/StatementServiceResponse;)V", "getServiceResponse", "()Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/fuliza/resp/StatementServiceResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcPochiWallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FulizaStatementReponse implements Serializable {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 31 % 128;

    @SerializedName("ServiceResponse")
    private final StatementServiceResponse ServiceResponse;

    public FulizaStatementReponse(StatementServiceResponse statementServiceResponse) {
        Intrinsics.checkNotNullParameter(statementServiceResponse, "");
        this.ServiceResponse = statementServiceResponse;
    }

    public final StatementServiceResponse getServiceResponse() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 41;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        StatementServiceResponse statementServiceResponse = this.ServiceResponse;
        int i5 = i2 + 51;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return statementServiceResponse;
        }
        throw null;
    }

    static {
        if (31 % 2 == 0) {
            int i = 18 / 0;
        }
    }

    public static FulizaStatementReponse copy$default(FulizaStatementReponse fulizaStatementReponse, StatementServiceResponse statementServiceResponse, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2 + 11;
        int i4 = i3 % 128;
        ShareDataUIState = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 43;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            statementServiceResponse = fulizaStatementReponse.ServiceResponse;
            if (i7 == 0) {
                int i8 = 19 / 0;
            }
        }
        FulizaStatementReponse fulizaStatementReponseCopy = fulizaStatementReponse.copy(statementServiceResponse);
        int i9 = component2 + 23;
        ShareDataUIState = i9 % 128;
        int i10 = i9 % 2;
        return fulizaStatementReponseCopy;
    }

    public final StatementServiceResponse component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 119;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        StatementServiceResponse statementServiceResponse = this.ServiceResponse;
        int i5 = i3 + 91;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return statementServiceResponse;
    }

    public final FulizaStatementReponse copy(StatementServiceResponse ServiceResponse) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(ServiceResponse, "");
        FulizaStatementReponse fulizaStatementReponse = new FulizaStatementReponse(ServiceResponse);
        int i2 = ShareDataUIState + 25;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return fulizaStatementReponse;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2 + 7;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof FulizaStatementReponse)) {
            int i5 = i3 + 49;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.ServiceResponse, ((FulizaStatementReponse) other).ServiceResponse)) {
            return true;
        }
        int i7 = component2 + 57;
        ShareDataUIState = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 73 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 73;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            this.ServiceResponse.hashCode();
            throw null;
        }
        int iHashCode = this.ServiceResponse.hashCode();
        int i3 = ShareDataUIState + 11;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FulizaStatementReponse(ServiceResponse=" + this.ServiceResponse + ")";
        int i2 = ShareDataUIState + 23;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
