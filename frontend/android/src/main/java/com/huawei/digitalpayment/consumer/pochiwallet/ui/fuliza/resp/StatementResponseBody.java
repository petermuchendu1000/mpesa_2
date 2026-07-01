package com.huawei.digitalpayment.consumer.pochiwallet.ui.fuliza.resp;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/fuliza/resp/StatementResponseBody;", "Ljava/io/Serializable;", "Body", "Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/fuliza/resp/StatementBody;", "<init>", "(Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/fuliza/resp/StatementBody;)V", "getBody", "()Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/fuliza/resp/StatementBody;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcPochiWallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StatementResponseBody implements Serializable {
    public static final int $stable = 8;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName("Body")
    private final StatementBody Body;

    public StatementResponseBody(StatementBody statementBody) {
        Intrinsics.checkNotNullParameter(statementBody, "");
        this.Body = statementBody;
    }

    public final StatementBody getBody() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 45;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        StatementBody statementBody = this.Body;
        int i5 = i2 + 53;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 2 / 0;
        }
        return statementBody;
    }

    static {
        int i = 1 + 125;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public static StatementResponseBody copy$default(StatementResponseBody statementResponseBody, StatementBody statementBody, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3 + 103;
        int i4 = i3 % 128;
        copydefault = i4;
        if (i3 % 2 == 0 && (i & 1) != 0) {
            statementBody = statementResponseBody.Body;
            int i5 = i4 + 103;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 3 % 3;
            }
        }
        return statementResponseBody.copy(statementBody);
    }

    public final StatementBody component1() {
        int i = 2 % 2;
        int i2 = copydefault + 49;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        StatementBody statementBody = this.Body;
        if (i3 == 0) {
            int i4 = 85 / 0;
        }
        return statementBody;
    }

    public final StatementResponseBody copy(StatementBody Body) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(Body, "");
        StatementResponseBody statementResponseBody = new StatementResponseBody(Body);
        int i2 = component3 + 67;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return statementResponseBody;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component3 + 49;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof StatementResponseBody)) {
            return false;
        }
        if (Intrinsics.areEqual(this.Body, ((StatementResponseBody) other).Body)) {
            return true;
        }
        int i4 = component3;
        int i5 = i4 + 29;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 67;
        copydefault = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 3;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.Body.hashCode();
        int i4 = copydefault + 65;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 61 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "StatementResponseBody(Body=" + this.Body + ")";
        int i2 = copydefault + 93;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
