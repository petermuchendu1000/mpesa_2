package com.huawei.digitalpayment.consumer.base.resp;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\b\"\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/Data;", "", "Name", "", "Value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getValue", "setValue", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Data {
    private static int component2 = 1;
    private static int component3;

    @SerializedName("Name")
    private final String Name;

    @SerializedName("Value")
    private String Value;

    public Data(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.Name = str;
        this.Value = str2;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = component2 + 15;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.Name;
        int i5 = i3 + 91;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getValue() {
        String str;
        int i = 2 % 2;
        int i2 = component3 + 29;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            str = this.Value;
            int i4 = 67 / 0;
        } else {
            str = this.Value;
        }
        int i5 = i3 + 15;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setValue(String str) {
        int i = 2 % 2;
        int i2 = component2 + 11;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.Value = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.Value = str;
            throw null;
        }
    }

    public static Data copy$default(Data data, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3;
        int i4 = i3 + 103;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 1;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            str = data.Name;
        }
        if ((i & 2) != 0) {
            str2 = data.Value;
            int i8 = component2 + 17;
            component3 = i8 % 128;
            int i9 = i8 % 2;
        }
        return data.copy(str, str2);
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 55;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.Name;
            int i4 = 44 / 0;
        } else {
            str = this.Name;
        }
        int i5 = i2 + 81;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 85;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.Value;
        int i5 = i2 + 3;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Data copy(String Name, String Value) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(Name, "");
        Intrinsics.checkNotNullParameter(Value, "");
        Data data = new Data(Name, Value);
        int i2 = component3 + 49;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return data;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof Data)) {
            int i2 = component3 + 69;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        Data data = (Data) other;
        if (!Intrinsics.areEqual(this.Name, data.Name)) {
            int i4 = component2 + 51;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.Value, data.Value)) {
            return true;
        }
        int i6 = component2 + 27;
        component3 = i6 % 128;
        if (i6 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 69;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.Name.hashCode() * 31) + this.Value.hashCode();
        int i4 = component3 + 47;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Data(Name=" + this.Name + ", Value=" + this.Value + ")";
        int i2 = component3 + 69;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
