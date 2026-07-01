package com.huawei.digitalpayment.consumer.sfcui.statement.resp;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\r\u001a\u00020\u000eH×\u0001J\t\u0010\u000f\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/DataResp;", "", "pdfEncoded", "", "<init>", "(Ljava/lang/String;)V", "getPdfEncoded", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DataResp {
    public static final int $stable = 0;
    private static int ShareDataUIState = 63 % 128;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int copydefault = 1;

    @SerializedName("pdfEncoded")
    private final String component3;

    public DataResp(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.component3 = str;
    }

    public final String getPdfEncoded() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 123;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component3;
        int i5 = i2 + 21;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        if (63 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static DataResp copy$default(DataResp dataResp, String str, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component2 + 113;
            int i4 = i3 % 128;
            copydefault = i4;
            if (i3 % 2 == 0) {
                str = dataResp.component3;
                int i5 = 15 / 0;
            } else {
                str = dataResp.component3;
            }
            int i6 = i4 + 25;
            component2 = i6 % 128;
            int i7 = i6 % 2;
        }
        return dataResp.copy(str);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 101;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final DataResp copy(String pdfEncoded) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(pdfEncoded, "");
        DataResp dataResp = new DataResp(pdfEncoded);
        int i2 = copydefault + 79;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return dataResp;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 105;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            int i4 = i2 + 105;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 69 / 0;
            }
            return true;
        }
        if (other instanceof DataResp) {
            return Intrinsics.areEqual(this.component3, ((DataResp) other).component3);
        }
        int i6 = i2 + 123;
        component2 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 17 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 93;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.component3.hashCode();
        int i4 = copydefault + 35;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DataResp(pdfEncoded=" + this.component3 + ")";
        int i2 = component2 + 101;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
