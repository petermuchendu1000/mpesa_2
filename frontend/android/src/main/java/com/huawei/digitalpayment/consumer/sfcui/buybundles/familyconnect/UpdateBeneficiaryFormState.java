package com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003JG\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001a\u001a\u00020\u001bH×\u0001J\t\u0010\u001c\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/UpdateBeneficiaryFormState;", "", "limitText", "", "previousAmount", "isAmountValid", "", "amountError", "isFormValid", "isLimitChanged", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZ)V", "getLimitText", "()Ljava/lang/String;", "getPreviousAmount", "()Z", "getAmountError", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UpdateBeneficiaryFormState {
    public static final int $stable = 0;
    private static int copy = 0;
    private static int equals = 67 % 128;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState;
    private final String ShareDataUIState;
    private final boolean component1;
    private final String component2;
    private final boolean component3;
    private final String component4;
    private final boolean copydefault;

    public UpdateBeneficiaryFormState(String str, String str2, boolean z, String str3, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.component2 = str;
        this.component4 = str2;
        this.component1 = z;
        this.ShareDataUIState = str3;
        this.copydefault = z2;
        this.component3 = z3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public UpdateBeneficiaryFormState(String str, String str2, boolean z, String str3, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z4;
        boolean z5;
        boolean z6;
        String str4 = (i & 1) != 0 ? "" : str;
        String str5 = (i & 2) == 0 ? str2 : "";
        if ((i & 4) != 0) {
            int i2 = getAsAtTimestamp + 5;
            copy = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 5 % 2;
            } else {
                int i4 = 2 % 2;
            }
            z4 = false;
        } else {
            z4 = z;
        }
        if ((i & 8) != 0) {
            int i5 = copy + 69;
            getAsAtTimestamp = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str3 = null;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            int i8 = getAsAtTimestamp + 45;
            copy = i8 % 128;
            int i9 = i8 % 2;
            z5 = false;
        } else {
            z5 = z2;
        }
        if ((i & 32) != 0) {
            int i10 = copy + 97;
            int i11 = i10 % 128;
            getAsAtTimestamp = i11;
            int i12 = i10 % 2;
            int i13 = i11 + 39;
            copy = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 2 % 2;
            }
            z6 = false;
        } else {
            z6 = z3;
        }
        this(str4, str5, z4, str6, z5, z6);
    }

    public final String getLimitText() {
        int i = 2 % 2;
        int i2 = copy + 81;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component2;
        }
        throw null;
    }

    public final String getPreviousAmount() {
        int i = 2 % 2;
        int i2 = copy + 13;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        String str = this.component4;
        int i5 = i3 + 57;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean isAmountValid() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 83;
        copy = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.component1;
        int i5 = i2 + 107;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final String getAmountError() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 57;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ShareDataUIState;
        }
        throw null;
    }

    public final boolean isFormValid() {
        int i = 2 % 2;
        int i2 = copy + 53;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z = this.copydefault;
        int i4 = i3 + 105;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final boolean isLimitChanged() {
        int i = 2 % 2;
        int i2 = copy + 5;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component3;
        }
        throw null;
    }

    static {
        int i = 67 % 2;
    }

    public UpdateBeneficiaryFormState() {
        this(null, null, false, null, false, false, 63, null);
    }

    public static UpdateBeneficiaryFormState copy$default(UpdateBeneficiaryFormState updateBeneficiaryFormState, String str, String str2, boolean z, String str3, boolean z2, boolean z3, int i, Object obj) {
        String str4;
        String str5;
        boolean z4;
        boolean z5;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str4 = updateBeneficiaryFormState.component2;
            int i3 = getAsAtTimestamp + 77;
            copy = i3 % 128;
            int i4 = i3 % 2;
        } else {
            str4 = str;
        }
        if ((i & 2) != 0) {
            int i5 = getAsAtTimestamp + 11;
            copy = i5 % 128;
            if (i5 % 2 != 0) {
                String str6 = updateBeneficiaryFormState.component4;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str5 = updateBeneficiaryFormState.component4;
        } else {
            str5 = str2;
        }
        if ((i & 4) != 0) {
            int i6 = copy + 27;
            getAsAtTimestamp = i6 % 128;
            int i7 = i6 % 2;
            z4 = updateBeneficiaryFormState.component1;
        } else {
            z4 = z;
        }
        String str7 = (i & 8) != 0 ? updateBeneficiaryFormState.ShareDataUIState : str3;
        if ((i & 16) != 0) {
            int i8 = copy + 113;
            getAsAtTimestamp = i8 % 128;
            int i9 = i8 % 2;
            z5 = updateBeneficiaryFormState.copydefault;
        } else {
            z5 = z2;
        }
        return updateBeneficiaryFormState.copy(str4, str5, z4, str7, z5, (i & 32) != 0 ? updateBeneficiaryFormState.component3 : z3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copy + 19;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        String str = this.component2;
        int i5 = i3 + 81;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 18 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 77;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component3() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 1;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.component1;
        int i5 = i2 + 27;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 44 / 0;
        }
        return z;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 13;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        String str = this.ShareDataUIState;
        int i5 = i3 + 15;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean component5() {
        int i = 2 % 2;
        int i2 = copy + 37;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        boolean z = this.copydefault;
        int i5 = i3 + 41;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean component6() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 91;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        boolean z = this.component3;
        int i5 = i3 + 121;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final UpdateBeneficiaryFormState copy(String limitText, String previousAmount, boolean isAmountValid, String amountError, boolean isFormValid, boolean isLimitChanged) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(limitText, "");
        Intrinsics.checkNotNullParameter(previousAmount, "");
        UpdateBeneficiaryFormState updateBeneficiaryFormState = new UpdateBeneficiaryFormState(limitText, previousAmount, isAmountValid, amountError, isFormValid, isLimitChanged);
        int i2 = copy + 67;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return updateBeneficiaryFormState;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateBeneficiaryFormState)) {
            int i2 = copy + 5;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        UpdateBeneficiaryFormState updateBeneficiaryFormState = (UpdateBeneficiaryFormState) other;
        if (!Intrinsics.areEqual(this.component2, updateBeneficiaryFormState.component2) || !Intrinsics.areEqual(this.component4, updateBeneficiaryFormState.component4) || this.component1 != updateBeneficiaryFormState.component1) {
            return false;
        }
        if (!Intrinsics.areEqual(this.ShareDataUIState, updateBeneficiaryFormState.ShareDataUIState)) {
            int i4 = getAsAtTimestamp + 7;
            copy = i4 % 128;
            return i4 % 2 != 0;
        }
        if (this.copydefault != updateBeneficiaryFormState.copydefault) {
            int i5 = getAsAtTimestamp + 69;
            copy = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (this.component3 == updateBeneficiaryFormState.component3) {
            return true;
        }
        int i7 = copy + 63;
        getAsAtTimestamp = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049 A[PHI: r1 r3 r4 r5
  0x0049: PHI (r1v18 int) = (r1v5 int), (r1v20 int) binds: [B:8:0x003d, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x0049: PHI (r3v4 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x003d, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x0049: PHI (r4v4 int) = (r4v1 int), (r4v6 int) binds: [B:8:0x003d, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x0049: PHI (r5v4 java.lang.String) = (r5v0 java.lang.String), (r5v5 java.lang.String) binds: [B:8:0x003d, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003f A[PHI: r1 r3 r4
  0x003f: PHI (r1v6 int) = (r1v5 int), (r1v20 int) binds: [B:8:0x003d, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x003f: PHI (r3v2 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x003d, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x003f: PHI (r4v2 int) = (r4v1 int), (r4v6 int) binds: [B:8:0x003d, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.UpdateBeneficiaryFormState.copy
            int r1 = r1 + 101
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.UpdateBeneficiaryFormState.getAsAtTimestamp = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L29
            java.lang.String r1 = r7.component2
            int r1 = r1.hashCode()
            java.lang.String r3 = r7.component4
            int r3 = r3.hashCode()
            boolean r4 = r7.component1
            int r4 = java.lang.Boolean.hashCode(r4)
            java.lang.String r5 = r7.ShareDataUIState
            r6 = 16
            int r6 = r6 / r2
            if (r5 != 0) goto L49
            goto L3f
        L29:
            java.lang.String r1 = r7.component2
            int r1 = r1.hashCode()
            java.lang.String r3 = r7.component4
            int r3 = r3.hashCode()
            boolean r4 = r7.component1
            int r4 = java.lang.Boolean.hashCode(r4)
            java.lang.String r5 = r7.ShareDataUIState
            if (r5 != 0) goto L49
        L3f:
            int r5 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.UpdateBeneficiaryFormState.getAsAtTimestamp
            int r5 = r5 + 85
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.UpdateBeneficiaryFormState.copy = r6
            int r5 = r5 % r0
            goto L4d
        L49:
            int r2 = r5.hashCode()
        L4d:
            int r1 = r1 * 31
            int r1 = r1 + r3
            int r1 = r1 * 31
            int r1 = r1 + r4
            int r1 = r1 * 31
            int r1 = r1 + r2
            int r1 = r1 * 31
            boolean r0 = r7.copydefault
            int r0 = java.lang.Boolean.hashCode(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r7.component3
            int r0 = java.lang.Boolean.hashCode(r0)
            int r1 = r1 + r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.UpdateBeneficiaryFormState.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UpdateBeneficiaryFormState(limitText=" + this.component2 + ", previousAmount=" + this.component4 + ", isAmountValid=" + this.component1 + ", amountError=" + this.ShareDataUIState + ", isFormValid=" + this.copydefault + ", isLimitChanged=" + this.component3 + ")";
        int i2 = copy + 9;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 32 / 0;
        }
        return str;
    }
}
