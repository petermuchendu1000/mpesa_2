package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H×\u0003J\t\u0010\u0014\u001a\u00020\u0015H×\u0001J\t\u0010\u0016\u001a\u00020\u0006H×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/TopUpPageResp;", "Ljava/io/Serializable;", "operators", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/OperatorResp;", "currency", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getOperators", "()Ljava/util/List;", "getCurrency", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TopUpPageResp implements Serializable {
    public static final int $stable = 8;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 119 % 128;
    private static int copydefault = 1;
    private final String currency;
    private final List<OperatorResp> operators;

    public TopUpPageResp(List<OperatorResp> list, String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.operators = list;
        this.currency = str;
    }

    public final List<OperatorResp> getOperators() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 121;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        List<OperatorResp> list = this.operators;
        int i5 = i2 + 43;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final String getCurrency() {
        int i = 2 % 2;
        int i2 = copydefault + 53;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.currency;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = 119 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static TopUpPageResp copy$default(TopUpPageResp topUpPageResp, List list, String str, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            list = topUpPageResp.operators;
            int i3 = component1 + 27;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
        }
        if ((i & 2) != 0) {
            str = topUpPageResp.currency;
        }
        TopUpPageResp topUpPageRespCopy = topUpPageResp.copy(list, str);
        int i5 = copydefault + 47;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 48 / 0;
        }
        return topUpPageRespCopy;
    }

    public final List<OperatorResp> component1() {
        int i = 2 % 2;
        int i2 = copydefault + 9;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        List<OperatorResp> list = this.operators;
        if (i3 != 0) {
            int i4 = 50 / 0;
        }
        return list;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 41;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.currency;
        int i5 = i2 + 3;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final TopUpPageResp copy(List<OperatorResp> operators, String currency) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(operators, "");
        Intrinsics.checkNotNullParameter(currency, "");
        TopUpPageResp topUpPageResp = new TopUpPageResp(operators, currency);
        int i2 = component1 + 69;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return topUpPageResp;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopUpPageResp)) {
            int i2 = component1 + 23;
            copydefault = i2 % 128;
            return i2 % 2 == 0;
        }
        TopUpPageResp topUpPageResp = (TopUpPageResp) other;
        if (!Intrinsics.areEqual(this.operators, topUpPageResp.operators)) {
            int i3 = copydefault + 5;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.currency, topUpPageResp.currency)) {
            return true;
        }
        int i5 = component1 + 69;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 17;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.operators.hashCode() * 31) + this.currency.hashCode();
        int i4 = copydefault + 117;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TopUpPageResp(operators=" + this.operators + ", currency=" + this.currency + ")";
        int i2 = component1 + 107;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
