package com.huawei.digitalpayment.consumer.fixeddata.presentation.state;

import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.accountBalances.FibreAccountBalances;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.FibreAccountDetails;
import com.huawei.digitalpayment.consumer.fixeddata.domain.model.AccountDetailsUiModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010#\u001a\u00020\u000eHÆ\u0003J[\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÇ\u0001J\u0013\u0010%\u001a\u00020\u00032\b\u0010&\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010'\u001a\u00020(H×\u0001J\t\u0010)\u001a\u00020\u0007H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006*"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/state/FixedDataTabState;", "", GriverMonitorConstants.KEY_IS_LOADING, "", "hasError", "accountIds", "", "", "selectedAccountId", "accountDetails", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountDetails/FibreAccountDetails;", "balances", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountBalances/FibreAccountBalances;", "accountDetailsUiModel", "Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/AccountDetailsUiModel;", "<init>", "(ZZLjava/util/List;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountDetails/FibreAccountDetails;Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountBalances/FibreAccountBalances;Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/AccountDetailsUiModel;)V", "()Z", "getHasError", "getAccountIds", "()Ljava/util/List;", "getSelectedAccountId", "()Ljava/lang/String;", "getAccountDetails", "()Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountDetails/FibreAccountDetails;", "getBalances", "()Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountBalances/FibreAccountBalances;", "getAccountDetailsUiModel", "()Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/AccountDetailsUiModel;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FixedDataTabState {
    public static final int $stable = 8;
    private static int equals = 0;
    private static int getAsAtTimestamp = 0;
    private static int getRequestBeneficiariesState = 1;
    private static int hashCode = 1;
    private final boolean ShareDataUIState;
    private final AccountDetailsUiModel component1;
    private final FibreAccountDetails component2;
    private final List<String> component3;
    private final boolean component4;
    private final String copy;
    private final FibreAccountBalances copydefault;

    public FixedDataTabState(boolean z, boolean z2, List<String> list, String str, FibreAccountDetails fibreAccountDetails, FibreAccountBalances fibreAccountBalances, AccountDetailsUiModel accountDetailsUiModel) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(accountDetailsUiModel, "");
        this.component4 = z;
        this.ShareDataUIState = z2;
        this.component3 = list;
        this.copy = str;
        this.component2 = fibreAccountDetails;
        this.copydefault = fibreAccountBalances;
        this.component1 = accountDetailsUiModel;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FixedDataTabState(boolean z, boolean z2, List list, String str, FibreAccountDetails fibreAccountDetails, FibreAccountBalances fibreAccountBalances, AccountDetailsUiModel accountDetailsUiModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z3;
        List listEmptyList;
        String str2;
        FibreAccountDetails fibreAccountDetails2;
        boolean z4 = (i & 1) != 0 ? false : z;
        if ((i & 2) != 0) {
            int i2 = equals + 117;
            hashCode = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 3 % 4;
            } else {
                int i4 = 2 % 2;
            }
            z3 = false;
        } else {
            z3 = z2;
        }
        if ((i & 4) != 0) {
            listEmptyList = CollectionsKt.emptyList();
            int i5 = 2 % 2;
        } else {
            listEmptyList = list;
        }
        if ((i & 8) != 0) {
            int i6 = equals + 23;
            hashCode = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 52 / 0;
            }
            int i8 = 2 % 2;
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i & 16) != 0) {
            int i9 = hashCode + 27;
            equals = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
            fibreAccountDetails2 = null;
        } else {
            fibreAccountDetails2 = fibreAccountDetails;
        }
        this(z4, z3, listEmptyList, str2, fibreAccountDetails2, (i & 32) == 0 ? fibreAccountBalances : null, (i & 64) != 0 ? new AccountDetailsUiModel(null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 262143, null) : accountDetailsUiModel);
    }

    public final boolean isLoading() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 65;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.component4;
        int i5 = i2 + 45;
        hashCode = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final boolean getHasError() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 115;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.ShareDataUIState;
        int i5 = i2 + 7;
        hashCode = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final List<String> getAccountIds() {
        int i = 2 % 2;
        int i2 = equals + 105;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        List<String> list = this.component3;
        if (i3 == 0) {
            int i4 = 40 / 0;
        }
        return list;
    }

    public final String getSelectedAccountId() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 53;
        equals = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copy;
        int i5 = i2 + 5;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final FibreAccountDetails getAccountDetails() {
        int i = 2 % 2;
        int i2 = hashCode + 25;
        int i3 = i2 % 128;
        equals = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        FibreAccountDetails fibreAccountDetails = this.component2;
        int i4 = i3 + 117;
        hashCode = i4 % 128;
        if (i4 % 2 != 0) {
            return fibreAccountDetails;
        }
        obj.hashCode();
        throw null;
    }

    public final FibreAccountBalances getBalances() {
        int i = 2 % 2;
        int i2 = hashCode + 109;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        FibreAccountBalances fibreAccountBalances = this.copydefault;
        int i5 = i3 + 7;
        hashCode = i5 % 128;
        if (i5 % 2 != 0) {
            return fibreAccountBalances;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final AccountDetailsUiModel getAccountDetailsUiModel() {
        int i = 2 % 2;
        int i2 = hashCode + 119;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        AccountDetailsUiModel accountDetailsUiModel = this.component1;
        int i5 = i3 + 51;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return accountDetailsUiModel;
    }

    static {
        int i = 1 + 65;
        getAsAtTimestamp = i % 128;
        int i2 = i % 2;
    }

    public FixedDataTabState() {
        this(false, false, null, null, null, null, null, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static FixedDataTabState copy$default(FixedDataTabState fixedDataTabState, boolean z, boolean z2, List list, String str, FibreAccountDetails fibreAccountDetails, FibreAccountBalances fibreAccountBalances, AccountDetailsUiModel accountDetailsUiModel, int i, Object obj) {
        boolean z3;
        FibreAccountBalances fibreAccountBalances2;
        int i2 = 2 % 2;
        boolean z4 = (i & 1) != 0 ? fixedDataTabState.component4 : z;
        if ((i & 2) != 0) {
            int i3 = equals + 79;
            hashCode = i3 % 128;
            if (i3 % 2 == 0) {
                boolean z5 = fixedDataTabState.ShareDataUIState;
                throw null;
            }
            z3 = fixedDataTabState.ShareDataUIState;
        } else {
            z3 = z2;
        }
        List list2 = (i & 4) != 0 ? fixedDataTabState.component3 : list;
        String str2 = (i & 8) != 0 ? fixedDataTabState.copy : str;
        FibreAccountDetails fibreAccountDetails2 = (i & 16) != 0 ? fixedDataTabState.component2 : fibreAccountDetails;
        if ((i & 32) != 0) {
            fibreAccountBalances2 = fixedDataTabState.copydefault;
            int i4 = equals + 73;
            hashCode = i4 % 128;
            int i5 = i4 % 2;
        } else {
            fibreAccountBalances2 = fibreAccountBalances;
        }
        FixedDataTabState fixedDataTabStateCopy = fixedDataTabState.copy(z4, z3, list2, str2, fibreAccountDetails2, fibreAccountBalances2, (i & 64) != 0 ? fixedDataTabState.component1 : accountDetailsUiModel);
        int i6 = hashCode + 47;
        equals = i6 % 128;
        int i7 = i6 % 2;
        return fixedDataTabStateCopy;
    }

    public final boolean component1() {
        int i = 2 % 2;
        int i2 = hashCode + 45;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        boolean z = this.component4;
        int i5 = i3 + 47;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean component2() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 71;
        equals = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.ShareDataUIState;
        int i4 = i2 + 17;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 47 / 0;
        }
        return z;
    }

    public final List<String> component3() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 115;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        List<String> list = this.component3;
        int i5 = i2 + 113;
        hashCode = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 99;
        hashCode = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.copy;
        int i4 = i2 + 83;
        hashCode = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final FibreAccountDetails component5() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 59;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        FibreAccountDetails fibreAccountDetails = this.component2;
        int i5 = i2 + 83;
        hashCode = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 45 / 0;
        }
        return fibreAccountDetails;
    }

    public final FibreAccountBalances component6() {
        int i = 2 % 2;
        int i2 = equals + 61;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        FibreAccountBalances fibreAccountBalances = this.copydefault;
        if (i3 == 0) {
            int i4 = 96 / 0;
        }
        return fibreAccountBalances;
    }

    public final AccountDetailsUiModel component7() {
        AccountDetailsUiModel accountDetailsUiModel;
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 87;
        equals = i3 % 128;
        if (i3 % 2 != 0) {
            accountDetailsUiModel = this.component1;
            int i4 = 29 / 0;
        } else {
            accountDetailsUiModel = this.component1;
        }
        int i5 = i2 + 19;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            return accountDetailsUiModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final FixedDataTabState copy(boolean isLoading, boolean hasError, List<String> accountIds, String selectedAccountId, FibreAccountDetails accountDetails, FibreAccountBalances balances, AccountDetailsUiModel accountDetailsUiModel) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(accountIds, "");
        Intrinsics.checkNotNullParameter(accountDetailsUiModel, "");
        FixedDataTabState fixedDataTabState = new FixedDataTabState(isLoading, hasError, accountIds, selectedAccountId, accountDetails, balances, accountDetailsUiModel);
        int i2 = equals + 75;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        return fixedDataTabState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = equals + 51;
            hashCode = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof FixedDataTabState)) {
            int i4 = hashCode + 15;
            equals = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        FixedDataTabState fixedDataTabState = (FixedDataTabState) other;
        if (this.component4 != fixedDataTabState.component4 || this.ShareDataUIState != fixedDataTabState.ShareDataUIState) {
            return false;
        }
        if (!Intrinsics.areEqual(this.component3, fixedDataTabState.component3)) {
            int i6 = equals + 111;
            hashCode = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.copy, fixedDataTabState.copy)) {
            return false;
        }
        if (Intrinsics.areEqual(this.component2, fixedDataTabState.component2)) {
            return Intrinsics.areEqual(this.copydefault, fixedDataTabState.copydefault) && Intrinsics.areEqual(this.component1, fixedDataTabState.component1);
        }
        int i8 = equals + 17;
        hashCode = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040 A[PHI: r1 r3 r4 r5 r6
  0x0040: PHI (r1v20 int) = (r1v5 int), (r1v22 int) binds: [B:8:0x003c, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
  0x0040: PHI (r3v4 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x003c, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
  0x0040: PHI (r4v4 int) = (r4v1 int), (r4v6 int) binds: [B:8:0x003c, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
  0x0040: PHI (r5v3 java.lang.String) = (r5v0 java.lang.String), (r5v5 java.lang.String) binds: [B:8:0x003c, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
  0x0040: PHI (r6v5 int) = (r6v0 int), (r6v6 int) binds: [B:8:0x003c, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e A[PHI: r1 r3 r4 r6
  0x003e: PHI (r1v6 int) = (r1v5 int), (r1v22 int) binds: [B:8:0x003c, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
  0x003e: PHI (r3v2 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x003c, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
  0x003e: PHI (r4v2 int) = (r4v1 int), (r4v6 int) binds: [B:8:0x003c, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
  0x003e: PHI (r6v1 int) = (r6v0 int), (r6v6 int) binds: [B:8:0x003c, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataTabState.hashCode
            int r1 = r1 + 3
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataTabState.equals = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L27
            boolean r1 = r9.component4
            int r1 = java.lang.Boolean.hashCode(r1)
            boolean r3 = r9.ShareDataUIState
            int r3 = java.lang.Boolean.hashCode(r3)
            java.util.List<java.lang.String> r4 = r9.component3
            int r4 = r4.hashCode()
            java.lang.String r5 = r9.copy
            r6 = 1
            if (r5 != 0) goto L40
            goto L3e
        L27:
            boolean r1 = r9.component4
            int r1 = java.lang.Boolean.hashCode(r1)
            boolean r3 = r9.ShareDataUIState
            int r3 = java.lang.Boolean.hashCode(r3)
            java.util.List<java.lang.String> r4 = r9.component3
            int r4 = r4.hashCode()
            java.lang.String r5 = r9.copy
            r6 = r2
            if (r5 != 0) goto L40
        L3e:
            r5 = r2
            goto L4d
        L40:
            int r5 = r5.hashCode()
            int r7 = com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataTabState.equals
            int r7 = r7 + 67
            int r8 = r7 % 128
            com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataTabState.hashCode = r8
            int r7 = r7 % r0
        L4d:
            com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.FibreAccountDetails r7 = r9.component2
            if (r7 != 0) goto L5b
            int r7 = com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataTabState.equals
            int r7 = r7 + 105
        L55:
            int r8 = r7 % 128
            com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataTabState.hashCode = r8
            int r7 = r7 % r0
            goto L64
        L5b:
            int r2 = r7.hashCode()
            int r7 = com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataTabState.equals
            int r7 = r7 + 31
            goto L55
        L64:
            com.huawei.digitalpayment.consumer.fixeddata.data.model.accountBalances.FibreAccountBalances r0 = r9.copydefault
            if (r0 != 0) goto L69
            goto L6d
        L69:
            int r6 = r0.hashCode()
        L6d:
            int r1 = r1 * 31
            int r1 = r1 + r3
            int r1 = r1 * 31
            int r1 = r1 + r4
            int r1 = r1 * 31
            int r1 = r1 + r5
            int r1 = r1 * 31
            int r1 = r1 + r2
            int r1 = r1 * 31
            int r1 = r1 + r6
            int r1 = r1 * 31
            com.huawei.digitalpayment.consumer.fixeddata.domain.model.AccountDetailsUiModel r0 = r9.component1
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataTabState.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FixedDataTabState(isLoading=" + this.component4 + ", hasError=" + this.ShareDataUIState + ", accountIds=" + this.component3 + ", selectedAccountId=" + this.copy + ", accountDetails=" + this.component2 + ", balances=" + this.copydefault + ", accountDetailsUiModel=" + this.component1 + ")";
        int i2 = hashCode + 17;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
