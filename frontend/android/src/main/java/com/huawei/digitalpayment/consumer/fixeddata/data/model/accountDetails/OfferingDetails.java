package com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u000eH×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountDetails/OfferingDetails;", "Landroid/os/Parcelable;", "name", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OfferingDetails implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<OfferingDetails> CREATOR = new Creator();
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("name")
    private final String name;

    @SerializedName("value")
    private final String value;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OfferingDetails> {
        private static int component3 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final OfferingDetails createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            OfferingDetails offeringDetails = new OfferingDetails(parcel.readString(), parcel.readString());
            int i2 = copydefault + 33;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                return offeringDetails;
            }
            throw null;
        }

        @Override
        public OfferingDetails createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 63;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            OfferingDetails offeringDetailsCreateFromParcel = createFromParcel(parcel);
            int i4 = copydefault + 97;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                return offeringDetailsCreateFromParcel;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final OfferingDetails[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault;
            int i4 = i3 + 63;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            OfferingDetails[] offeringDetailsArr = new OfferingDetails[i];
            int i6 = i3 + 11;
            component3 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 79 / 0;
            }
            return offeringDetailsArr;
        }

        @Override
        public OfferingDetails[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 23;
            component3 = i3 % 128;
            if (i3 % 2 != 0) {
                return newArray(i);
            }
            newArray(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public OfferingDetails(String str, String str2) {
        this.name = str;
        this.value = str2;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = copydefault + 69;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.name;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = component3 + 35;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.value;
        int i5 = i3 + 117;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = component2 + 23;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public static OfferingDetails copy$default(OfferingDetails offeringDetails, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = copydefault + 111;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            str = offeringDetails.name;
        }
        if ((i & 2) != 0) {
            str2 = offeringDetails.value;
            int i5 = copydefault + 29;
            component3 = i5 % 128;
            int i6 = i5 % 2;
        }
        return offeringDetails.copy(str, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 73;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.name;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 45;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.value;
        int i5 = i2 + 91;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final OfferingDetails copy(String name, String value) {
        int i = 2 % 2;
        OfferingDetails offeringDetails = new OfferingDetails(name, value);
        int i2 = component3 + 69;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return offeringDetails;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 125;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 13;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 33;
        int i4 = i3 % 128;
        component3 = i4;
        int i5 = i3 % 2;
        if (this == other) {
            int i6 = i2 + 77;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(other instanceof OfferingDetails)) {
            int i8 = i4 + 53;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        OfferingDetails offeringDetails = (OfferingDetails) other;
        if (!Intrinsics.areEqual(this.name, offeringDetails.name)) {
            return false;
        }
        if (Intrinsics.areEqual(this.value, offeringDetails.value)) {
            return true;
        }
        int i10 = copydefault + 85;
        component3 = i10 % 128;
        return i10 % 2 != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.OfferingDetails.component3
            int r1 = r1 + 39
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.OfferingDetails.copydefault = r2
            int r1 = r1 % r0
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L18
            java.lang.String r1 = r6.name
            if (r1 != 0) goto L16
            r1 = r4
            goto L1d
        L16:
            r3 = r4
            goto L2b
        L18:
            java.lang.String r1 = r6.name
            if (r1 != 0) goto L2b
            r1 = r3
        L1d:
            int r2 = r2 + 29
            int r5 = r2 % 128
            com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.OfferingDetails.component3 = r5
            int r2 = r2 % r0
            if (r2 == 0) goto L27
            goto L28
        L27:
            r3 = r4
        L28:
            r0 = r3 ^ 1
            goto L30
        L2b:
            int r0 = r1.hashCode()
            r1 = r3
        L30:
            java.lang.String r2 = r6.value
            if (r2 != 0) goto L35
            goto L39
        L35:
            int r1 = r2.hashCode()
        L39:
            int r0 = r0 * 31
            int r0 = r0 + r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.OfferingDetails.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OfferingDetails(name=" + this.name + ", value=" + this.value + ")";
        int i2 = component3 + 3;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 7;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        String str = this.name;
        if (i3 == 0) {
            dest.writeString(str);
            dest.writeString(this.value);
        } else {
            dest.writeString(str);
            dest.writeString(this.value);
            int i4 = 15 / 0;
        }
    }
}
