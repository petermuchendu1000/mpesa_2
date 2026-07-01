package com.huawei.digitalpayment.consumer.sfcui.statement.resp;

import com.safaricom.consumer.commons.statements.Statement;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÇ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH×\u0003J\t\u0010\u000f\u001a\u00020\u0010H×\u0001J\t\u0010\u0011\u001a\u00020\u0012H×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/Result;", "Ljava/io/Serializable;", "statements", "", "Lcom/safaricom/consumer/commons/statements/Statement;", "<init>", "(Ljava/util/List;)V", "getStatements", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Result implements Serializable {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component1 = 79 % 128;
    private static int component2 = 0;
    private static int component3 = 1;
    private final List<Statement> statements;

    public Result(List<Statement> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.statements = list;
    }

    public final List<Statement> getStatements() {
        int i = 2 % 2;
        int i2 = component2 + 19;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        List<Statement> list = this.statements;
        int i5 = i3 + 39;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    static {
        int i = 79 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Result copy$default(Result result, List list, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            list = result.statements;
            int i3 = component3 + 77;
            component2 = i3 % 128;
            int i4 = i3 % 2;
        }
        Result resultCopy = result.copy(list);
        int i5 = component3 + 81;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return resultCopy;
    }

    public final List<Statement> component1() {
        int i = 2 % 2;
        int i2 = component2 + 105;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        List<Statement> list = this.statements;
        if (i3 == 0) {
            int i4 = 18 / 0;
        }
        return list;
    }

    public final Result copy(List<Statement> statements) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(statements, "");
        Result result = new Result(statements);
        int i2 = component3 + 5;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return result;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 55;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        if (this != other) {
            return (other instanceof Result) && Intrinsics.areEqual(this.statements, ((Result) other).statements);
        }
        int i5 = i2 + 95;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 121;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            this.statements.hashCode();
            throw null;
        }
        int iHashCode = this.statements.hashCode();
        int i3 = component3 + 1;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 40 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Result(statements=" + this.statements + ")";
        int i2 = component2 + 121;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
