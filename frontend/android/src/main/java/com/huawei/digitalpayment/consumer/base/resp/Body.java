package com.huawei.digitalpayment.consumer.base.resp;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/Body;", "", "datum", "", "Lcom/huawei/digitalpayment/consumer/base/resp/Data;", "<init>", "(Ljava/util/List;)V", "getDatum", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Body {
    private static int component2 = 0;
    private static int component3 = 1;

    @SerializedName("data")
    private final List<Data> datum;

    public Body(List<Data> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.datum = list;
    }

    public final List<Data> getDatum() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 35;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        List<Data> list = this.datum;
        int i5 = i2 + 31;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Body copy$default(Body body, List list, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component2 + 5;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            list = body.datum;
        }
        Body bodyCopy = body.copy(list);
        int i5 = component2 + 67;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return bodyCopy;
    }

    public final List<Data> component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 111;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        List<Data> list = this.datum;
        int i5 = i2 + 59;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final Body copy(List<Data> datum) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(datum, "");
        Body body = new Body(datum);
        int i2 = component3 + 19;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return body;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof Body)) {
            int i2 = component3 + 33;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.datum, ((Body) other).datum)) {
            return true;
        }
        int i4 = component2 + 109;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 83;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.datum.hashCode();
        int i4 = component2 + 5;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Body(datum=" + this.datum + ")";
        int i2 = component2 + 73;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
