package com.huawei.digitalpayment.consumer.base.resp;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/MyData;", "", "aiPayResponse", "", "Lcom/huawei/digitalpayment/consumer/base/resp/AiPayResponse;", "<init>", "(Ljava/util/List;)V", "getAiPayResponse", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MyData {
    private static int component2 = 1;
    private static int copydefault;
    private final List<AiPayResponse> aiPayResponse;

    public MyData(List<AiPayResponse> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.aiPayResponse = list;
    }

    public final List<AiPayResponse> getAiPayResponse() {
        int i = 2 % 2;
        int i2 = copydefault + 97;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        List<AiPayResponse> list = this.aiPayResponse;
        int i5 = i3 + 73;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static MyData copy$default(MyData myData, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault + 37;
        int i4 = i3 % 128;
        component2 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            list = myData.aiPayResponse;
            int i6 = i4 + 77;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
        }
        return myData.copy(list);
    }

    public final List<AiPayResponse> component1() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 23;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        List<AiPayResponse> list = this.aiPayResponse;
        int i5 = i2 + 27;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final MyData copy(List<AiPayResponse> aiPayResponse) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(aiPayResponse, "");
        MyData myData = new MyData(aiPayResponse);
        int i2 = component2 + 49;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 71 / 0;
        }
        return myData;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault + 85;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        if (this == other) {
            int i5 = i3 + 55;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (other instanceof MyData) {
            if (!Intrinsics.areEqual(this.aiPayResponse, ((MyData) other).aiPayResponse)) {
                return false;
            }
            int i7 = component2 + 19;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
            return true;
        }
        int i9 = i3 + 63;
        copydefault = i9 % 128;
        if (i9 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 35;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.aiPayResponse.hashCode();
        int i4 = component2 + 113;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 64 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MyData(aiPayResponse=" + this.aiPayResponse + ")";
        int i2 = component2 + 65;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
