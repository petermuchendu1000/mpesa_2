package com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0018\u001a\u00020\u0006H\u0007J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH×\u0003J\t\u0010\u001d\u001a\u00020\u0006H×\u0001J\t\u0010\u001e\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0006H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006$"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/model/FamilyConnectManageBeneficiaryPayload;", "Landroid/os/Parcelable;", "beneficiaryMsisdn", "", "beneficiaryNickname", "limit", "", "operation", "sponsorMsisdn", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getBeneficiaryMsisdn", "()Ljava/lang/String;", "getBeneficiaryNickname", "getLimit", "()I", "getOperation", "getSponsorMsisdn", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FamilyConnectManageBeneficiaryPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<FamilyConnectManageBeneficiaryPayload> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("beneficiaryMsisdn")
    private final String beneficiaryMsisdn;

    @SerializedName("beneficiaryNickname")
    private final String beneficiaryNickname;

    @SerializedName("limit")
    private final int limit;

    @SerializedName("operation")
    private final String operation;

    @SerializedName("sponsorMsisdn")
    private final String sponsorMsisdn;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FamilyConnectManageBeneficiaryPayload> {
        private static int component2 = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FamilyConnectManageBeneficiaryPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            FamilyConnectManageBeneficiaryPayload familyConnectManageBeneficiaryPayload = new FamilyConnectManageBeneficiaryPayload(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
            int i2 = component3 + 33;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return familyConnectManageBeneficiaryPayload;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public FamilyConnectManageBeneficiaryPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 85;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FamilyConnectManageBeneficiaryPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 83;
            component2 = i3 % 128;
            FamilyConnectManageBeneficiaryPayload[] familyConnectManageBeneficiaryPayloadArr = new FamilyConnectManageBeneficiaryPayload[i];
            if (i3 % 2 == 0) {
                int i4 = 62 / 0;
            }
            return familyConnectManageBeneficiaryPayloadArr;
        }

        @Override
        public FamilyConnectManageBeneficiaryPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 31;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            FamilyConnectManageBeneficiaryPayload[] familyConnectManageBeneficiaryPayloadArrNewArray = newArray(i);
            int i5 = component3 + 31;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return familyConnectManageBeneficiaryPayloadArrNewArray;
        }
    }

    public FamilyConnectManageBeneficiaryPayload(String str, String str2, int i, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.beneficiaryMsisdn = str;
        this.beneficiaryNickname = str2;
        this.limit = i;
        this.operation = str3;
        this.sponsorMsisdn = str4;
    }

    public final String getBeneficiaryMsisdn() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 1;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.beneficiaryMsisdn;
        int i4 = i2 + 105;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getBeneficiaryNickname() {
        int i = 2 % 2;
        int i2 = component3 + 83;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.beneficiaryNickname;
        int i5 = i3 + 113;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int getLimit() {
        int i = 2 % 2;
        int i2 = component3 + 19;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = this.limit;
        int i5 = i3 + 123;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final String getOperation() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 51;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.operation;
        int i5 = i2 + 47;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 76 / 0;
        }
        return str;
    }

    public final String getSponsorMsisdn() {
        int i = 2 % 2;
        int i2 = component3 + 27;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.sponsorMsisdn;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = ShareDataUIState + 53;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public static FamilyConnectManageBeneficiaryPayload copy$default(FamilyConnectManageBeneficiaryPayload familyConnectManageBeneficiaryPayload, String str, String str2, int i, String str3, String str4, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = component3 + 37;
        int i5 = i4 % 128;
        copydefault = i5;
        if (i4 % 2 != 0 ? (i2 & 1) != 0 : (i2 & 1) != 0) {
            str = familyConnectManageBeneficiaryPayload.beneficiaryMsisdn;
        }
        String str5 = str;
        if ((i2 & 2) != 0) {
            str2 = familyConnectManageBeneficiaryPayload.beneficiaryNickname;
        }
        String str6 = str2;
        if ((i2 & 4) != 0) {
            int i6 = i5 + 87;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            i = familyConnectManageBeneficiaryPayload.limit;
        }
        int i8 = i;
        if ((i2 & 8) != 0) {
            str3 = familyConnectManageBeneficiaryPayload.operation;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            int i9 = i5 + 65;
            component3 = i9 % 128;
            int i10 = i9 % 2;
            str4 = familyConnectManageBeneficiaryPayload.sponsorMsisdn;
        }
        return familyConnectManageBeneficiaryPayload.copy(str5, str6, i8, str7, str4);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 49;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.beneficiaryMsisdn;
        int i5 = i2 + 25;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 115;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.beneficiaryNickname;
        int i5 = i2 + 17;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int component3() {
        int i = 2 % 2;
        int i2 = component3 + 19;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.limit;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 21;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.operation;
        int i5 = i2 + 3;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 5 / 0;
        }
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 99;
        copydefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.sponsorMsisdn;
        int i4 = i2 + 5;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final FamilyConnectManageBeneficiaryPayload copy(String beneficiaryMsisdn, String beneficiaryNickname, int limit, String operation, String sponsorMsisdn) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(beneficiaryMsisdn, "");
        Intrinsics.checkNotNullParameter(beneficiaryNickname, "");
        Intrinsics.checkNotNullParameter(operation, "");
        Intrinsics.checkNotNullParameter(sponsorMsisdn, "");
        FamilyConnectManageBeneficiaryPayload familyConnectManageBeneficiaryPayload = new FamilyConnectManageBeneficiaryPayload(beneficiaryMsisdn, beneficiaryNickname, limit, operation, sponsorMsisdn);
        int i2 = copydefault + 67;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return familyConnectManageBeneficiaryPayload;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 13;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 107;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if ((!(r6 instanceof com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectManageBeneficiaryPayload)) == true) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r6 = (com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectManageBeneficiaryPayload) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.beneficiaryMsisdn, r6.beneficiaryMsisdn) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5.beneficiaryNickname, r6.beneficiaryNickname)) == true) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        if (r5.limit == r6.limit) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.operation, r6.operation) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.sponsorMsisdn, r6.sponsorMsisdn) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectManageBeneficiaryPayload.copydefault + 99;
        com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectManageBeneficiaryPayload.component3 = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        if ((r6 % 2) == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectManageBeneficiaryPayload.copydefault
            int r1 = r1 + 109
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectManageBeneficiaryPayload.component3 = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L16
            r1 = 72
            int r1 = r1 / r3
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r2
        L19:
            boolean r1 = r6 instanceof com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectManageBeneficiaryPayload
            r1 = r1 ^ r2
            if (r1 == r2) goto L60
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectManageBeneficiaryPayload r6 = (com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectManageBeneficiaryPayload) r6
            java.lang.String r1 = r5.beneficiaryMsisdn
            java.lang.String r4 = r6.beneficiaryMsisdn
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L2b
            return r3
        L2b:
            java.lang.String r1 = r5.beneficiaryNickname
            java.lang.String r4 = r6.beneficiaryNickname
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            r1 = r1 ^ r2
            if (r1 == r2) goto L60
            int r1 = r5.limit
            int r4 = r6.limit
            if (r1 == r4) goto L3d
            return r3
        L3d:
            java.lang.String r1 = r5.operation
            java.lang.String r4 = r6.operation
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L48
            return r3
        L48:
            java.lang.String r1 = r5.sponsorMsisdn
            java.lang.String r6 = r6.sponsorMsisdn
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)
            if (r6 != 0) goto L5f
            int r6 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectManageBeneficiaryPayload.copydefault
            int r6 = r6 + 99
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectManageBeneficiaryPayload.component3 = r1
            int r6 = r6 % r0
            if (r6 == 0) goto L5e
            goto L5f
        L5e:
            r2 = r3
        L5f:
            return r2
        L60:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectManageBeneficiaryPayload.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 33;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.beneficiaryMsisdn.hashCode() * 31) + this.beneficiaryNickname.hashCode()) * 31) + Integer.hashCode(this.limit)) * 31) + this.operation.hashCode()) * 31) + this.sponsorMsisdn.hashCode();
        int i4 = copydefault + 99;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 65 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FamilyConnectManageBeneficiaryPayload(beneficiaryMsisdn=" + this.beneficiaryMsisdn + ", beneficiaryNickname=" + this.beneficiaryNickname + ", limit=" + this.limit + ", operation=" + this.operation + ", sponsorMsisdn=" + this.sponsorMsisdn + ")";
        int i2 = component3 + 35;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 111;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.beneficiaryMsisdn);
        dest.writeString(this.beneficiaryNickname);
        dest.writeInt(this.limit);
        dest.writeString(this.operation);
        dest.writeString(this.sponsorMsisdn);
        if (i3 == 0) {
            int i4 = 25 / 0;
        }
    }
}
