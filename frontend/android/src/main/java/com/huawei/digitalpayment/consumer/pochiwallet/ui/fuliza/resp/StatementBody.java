package com.huawei.digitalpayment.consumer.pochiwallet.ui.fuliza.resp;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0003H×\u0003J\t\u0010\r\u001a\u00020\u000eH×\u0001J\t\u0010\u000f\u001a\u00020\u0010H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/fuliza/resp/StatementBody;", "Ljava/io/Serializable;", "data", "", "<init>", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ConsumerSfcPochiWallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StatementBody implements Serializable {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("data")
    private final Object data;

    public StatementBody(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        this.data = obj;
    }

    public final Object getData() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 111;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        Object obj = this.data;
        int i5 = i2 + 65;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return obj;
    }

    static {
        int i = 1 + 109;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static StatementBody copy$default(StatementBody statementBody, Object obj, int i, Object obj2) {
        int i2 = 2 % 2;
        int i3 = copydefault;
        int i4 = i3 + 59;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 89;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            obj = statementBody.data;
            int i8 = i3 + 121;
            component3 = i8 % 128;
            int i9 = i8 % 2;
        }
        return statementBody.copy(obj);
    }

    public final Object component1() {
        int i = 2 % 2;
        int i2 = copydefault + 101;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Object obj = this.data;
        int i5 = i3 + 113;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return obj;
    }

    public final StatementBody copy(Object data) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(data, "");
        StatementBody statementBody = new StatementBody(data);
        int i2 = copydefault + 77;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return statementBody;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3 + 63;
        int i3 = i2 % 128;
        copydefault = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (this != other) {
            return (other instanceof StatementBody) && Intrinsics.areEqual(this.data, ((StatementBody) other).data);
        }
        int i4 = i3 + 71;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return true;
        }
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 41;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.data.hashCode();
        int i4 = component3 + 45;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "StatementBody(data=" + this.data + ")";
        int i2 = copydefault + 51;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
