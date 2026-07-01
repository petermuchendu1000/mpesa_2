package com.huawei.digitalpayment.consumer.sfcui.postpay.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\u0006¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\"\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJD\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u001c\b\u0002\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\u0006HÇ\u0001¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0017H\u0007J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH×\u0003J\t\u0010\u001c\u001a\u00020\u0017H×\u0001J\t\u0010\u001d\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR,\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006#"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/JoinPostpayPayload;", "Landroid/os/Parcelable;", "msisdn", "", "email", "migrationData", "Lkotlin/collections/ArrayList;", "Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/MigrationData;", "Ljava/util/ArrayList;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "getMsisdn", "()Ljava/lang/String;", "getEmail", "getMigrationData", "()Ljava/util/ArrayList;", "Ljava/util/ArrayList;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/JoinPostpayPayload;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JoinPostpayPayload implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<JoinPostpayPayload> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    @SerializedName("email")
    private final String email;

    @SerializedName("migrationData")
    private final ArrayList<MigrationData> migrationData;

    @SerializedName("msisdn")
    private final String msisdn;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<JoinPostpayPayload> {
        private static int component2 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final JoinPostpayPayload createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i = 2 % 2;
            int i2 = copydefault + 123;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i4 = copydefault + 11;
                component2 = i4 % 128;
                arrayList = null;
                if (i4 % 2 != 0) {
                    throw null;
                }
            } else {
                int i5 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList2.add(MigrationData.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new JoinPostpayPayload(string, string2, arrayList);
        }

        @Override
        public JoinPostpayPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 93;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            JoinPostpayPayload joinPostpayPayloadCreateFromParcel = createFromParcel(parcel);
            if (i3 != 0) {
                int i4 = 79 / 0;
            }
            int i5 = copydefault + 5;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return joinPostpayPayloadCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final JoinPostpayPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 47;
            component2 = i3 % 128;
            JoinPostpayPayload[] joinPostpayPayloadArr = new JoinPostpayPayload[i];
            if (i3 % 2 == 0) {
                return joinPostpayPayloadArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public JoinPostpayPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 97;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            JoinPostpayPayload[] joinPostpayPayloadArrNewArray = newArray(i);
            int i5 = component2 + 117;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return joinPostpayPayloadArrNewArray;
        }
    }

    public JoinPostpayPayload(String str, String str2, ArrayList<MigrationData> arrayList) {
        this.msisdn = str;
        this.email = str2;
        this.migrationData = arrayList;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = copydefault + 41;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.msisdn;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getEmail() {
        int i = 2 % 2;
        int i2 = copydefault + 29;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.email;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ArrayList<MigrationData> getMigrationData() {
        int i = 2 % 2;
        int i2 = component1 + 101;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        ArrayList<MigrationData> arrayList = this.migrationData;
        int i4 = i3 + 59;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    static {
        int i = ShareDataUIState + 103;
        component3 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static JoinPostpayPayload copy$default(JoinPostpayPayload joinPostpayPayload, String str, String str2, ArrayList arrayList, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component1 + 19;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            str = joinPostpayPayload.msisdn;
        }
        if ((i & 2) != 0) {
            int i5 = component1 + 49;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                String str3 = joinPostpayPayload.email;
                throw null;
            }
            str2 = joinPostpayPayload.email;
        }
        if ((i & 4) != 0) {
            int i6 = copydefault + 53;
            component1 = i6 % 128;
            if (i6 % 2 != 0) {
                ArrayList<MigrationData> arrayList2 = joinPostpayPayload.migrationData;
                throw null;
            }
            arrayList = joinPostpayPayload.migrationData;
        }
        return joinPostpayPayload.copy(str, str2, arrayList);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 91;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.msisdn;
        int i5 = i3 + 125;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault + 119;
        int i3 = i2 % 128;
        component1 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.email;
        int i4 = i3 + 95;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final ArrayList<MigrationData> component3() {
        ArrayList<MigrationData> arrayList;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 123;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            arrayList = this.migrationData;
            int i4 = 36 / 0;
        } else {
            arrayList = this.migrationData;
        }
        int i5 = i2 + 85;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return arrayList;
    }

    public final JoinPostpayPayload copy(String msisdn, String email, ArrayList<MigrationData> migrationData) {
        int i = 2 % 2;
        JoinPostpayPayload joinPostpayPayload = new JoinPostpayPayload(msisdn, email, migrationData);
        int i2 = component1 + 11;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return joinPostpayPayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 83;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2 == 0 ? 1 : 0;
        int i5 = i3 + 15;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 34 / 0;
        }
        return i4;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component1 + 43;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        if (this == other) {
            int i5 = i3 + 37;
            component1 = i5 % 128;
            return i5 % 2 == 0;
        }
        if (!(other instanceof JoinPostpayPayload)) {
            return false;
        }
        JoinPostpayPayload joinPostpayPayload = (JoinPostpayPayload) other;
        if (!Intrinsics.areEqual(this.msisdn, joinPostpayPayload.msisdn)) {
            int i6 = component1 + 13;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.email, joinPostpayPayload.email)) {
            int i8 = copydefault + 87;
            component1 = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.migrationData, joinPostpayPayload.migrationData)) {
            return true;
        }
        int i10 = component1 + 29;
        copydefault = i10 % 128;
        return i10 % 2 == 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.msisdn;
        int iHashCode3 = 0;
        if (str == null) {
            int i2 = component1 + 41;
            copydefault = i2 % 128;
            iHashCode = (i2 % 2 == 0 ? 0 : 1) ^ 1;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.email;
        if (str2 == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
            int i3 = component1 + 45;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
        }
        ArrayList<MigrationData> arrayList = this.migrationData;
        if (arrayList != null) {
            iHashCode3 = arrayList.hashCode();
            int i5 = component1 + 27;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
        }
        return (((iHashCode * 31) + iHashCode2) * 31) + iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "JoinPostpayPayload(msisdn=" + this.msisdn + ", email=" + this.email + ", migrationData=" + this.migrationData + ")";
        int i2 = copydefault + 105;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        r5.writeInt(1);
        r5.writeInt(r1.size());
        r1 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:
    
        if ((!r1.hasNext()) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0056, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
    
        r1.next().writeToParcel(r5, r6);
        r2 = com.huawei.digitalpayment.consumer.sfcui.postpay.models.JoinPostpayPayload.copydefault + 107;
        com.huawei.digitalpayment.consumer.sfcui.postpay.models.JoinPostpayPayload.component1 = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.postpay.models.JoinPostpayPayload.copydefault + 21;
        com.huawei.digitalpayment.consumer.sfcui.postpay.models.JoinPostpayPayload.component1 = r6 % 128;
        r6 = r6 % 2;
        r5.writeInt(0);
     */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeToParcel(android.os.Parcel r5, int r6) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.postpay.models.JoinPostpayPayload.component1
            int r1 = r1 + 55
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.postpay.models.JoinPostpayPayload.copydefault = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            r3 = 0
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            if (r1 != 0) goto L25
            java.lang.String r1 = r4.msisdn
            r5.writeString(r1)
            java.lang.String r1 = r4.email
            r5.writeString(r1)
            java.util.ArrayList<com.huawei.digitalpayment.consumer.sfcui.postpay.models.MigrationData> r1 = r4.migrationData
            r2 = 2
            int r2 = r2 / r3
            if (r1 != 0) goto L40
            goto L33
        L25:
            java.lang.String r1 = r4.msisdn
            r5.writeString(r1)
            java.lang.String r1 = r4.email
            r5.writeString(r1)
            java.util.ArrayList<com.huawei.digitalpayment.consumer.sfcui.postpay.models.MigrationData> r1 = r4.migrationData
            if (r1 != 0) goto L40
        L33:
            int r6 = com.huawei.digitalpayment.consumer.sfcui.postpay.models.JoinPostpayPayload.copydefault
            int r6 = r6 + 21
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.postpay.models.JoinPostpayPayload.component1 = r1
            int r6 = r6 % r0
            r5.writeInt(r3)
            goto L56
        L40:
            r0 = 1
            r5.writeInt(r0)
            int r2 = r1.size()
            r5.writeInt(r2)
            java.util.Iterator r1 = r1.iterator()
        L4f:
            boolean r2 = r1.hasNext()
            r2 = r2 ^ r0
            if (r2 == 0) goto L57
        L56:
            return
        L57:
            java.lang.Object r2 = r1.next()
            com.huawei.digitalpayment.consumer.sfcui.postpay.models.MigrationData r2 = (com.huawei.digitalpayment.consumer.sfcui.postpay.models.MigrationData) r2
            r2.writeToParcel(r5, r6)
            int r2 = com.huawei.digitalpayment.consumer.sfcui.postpay.models.JoinPostpayPayload.copydefault
            int r2 = r2 + 107
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.postpay.models.JoinPostpayPayload.component1 = r3
            int r2 = r2 % 2
            goto L4f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.postpay.models.JoinPostpayPayload.writeToParcel(android.os.Parcel, int):void");
    }
}
