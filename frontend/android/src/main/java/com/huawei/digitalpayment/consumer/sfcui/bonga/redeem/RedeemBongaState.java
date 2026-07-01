package com.huawei.digitalpayment.consumer.sfcui.bonga.redeem;

import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.huawei.digitalpayment.consumer.sfcui.bonga.model.BongaMatrixUnit;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003JU\u0010\u001d\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÇ\u0001J\u0013\u0010\u001e\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010 \u001a\u00020!H×\u0001J\t\u0010\"\u001a\u00020\u0004H×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015¨\u0006#"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/redeem/RedeemBongaState;", "", "redeemTypeOptions", "", "", "selectedRedeemType", "unitOptions", "Lcom/huawei/digitalpayment/consumer/sfcui/bonga/model/BongaMatrixUnit;", "selectedUnit", GriverMonitorConstants.KEY_IS_LOADING, "", "hasError", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/huawei/digitalpayment/consumer/sfcui/bonga/model/BongaMatrixUnit;ZZ)V", "getRedeemTypeOptions", "()Ljava/util/List;", "getSelectedRedeemType", "()Ljava/lang/String;", "getUnitOptions", "getSelectedUnit", "()Lcom/huawei/digitalpayment/consumer/sfcui/bonga/model/BongaMatrixUnit;", "()Z", "getHasError", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RedeemBongaState {
    public static final int $stable = 8;
    private static int copy = 0;
    private static int equals = 1;
    private static int getAsAtTimestamp = 0;
    private static int getRequestBeneficiariesState = 77 % 128;
    private final boolean ShareDataUIState;
    private final List<String> component1;
    private final BongaMatrixUnit component2;
    private final boolean component3;
    private final List<BongaMatrixUnit> component4;
    private final String copydefault;

    public RedeemBongaState(List<String> list, String str, List<BongaMatrixUnit> list2, BongaMatrixUnit bongaMatrixUnit, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.component1 = list;
        this.copydefault = str;
        this.component4 = list2;
        this.component2 = bongaMatrixUnit;
        this.component3 = z;
        this.ShareDataUIState = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RedeemBongaState(List list, String str, List list2, BongaMatrixUnit bongaMatrixUnit, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str2;
        boolean z3;
        list = (i & 1) != 0 ? CollectionsKt.emptyList() : list;
        BongaMatrixUnit bongaMatrixUnit2 = null;
        if ((i & 2) != 0) {
            int i2 = equals + 111;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i & 4) != 0) {
            int i4 = equals + 45;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            list2 = CollectionsKt.emptyList();
        }
        List list3 = list2;
        if ((i & 8) != 0) {
            int i6 = getAsAtTimestamp + 89;
            equals = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 58 / 0;
            }
            int i8 = 2 % 2;
        } else {
            bongaMatrixUnit2 = bongaMatrixUnit;
        }
        if ((i & 16) != 0) {
            int i9 = 2 % 2;
            z3 = false;
        } else {
            z3 = z;
        }
        this(list, str2, list3, bongaMatrixUnit2, z3, (i & 32) != 0 ? false : z2);
    }

    public final List<String> getRedeemTypeOptions() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 33;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getSelectedRedeemType() {
        int i = 2 % 2;
        int i2 = equals + 57;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.copydefault;
        int i4 = i3 + 19;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final List<BongaMatrixUnit> getUnitOptions() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 111;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        List<BongaMatrixUnit> list = this.component4;
        int i5 = i2 + 37;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public final BongaMatrixUnit getSelectedUnit() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 125;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        BongaMatrixUnit bongaMatrixUnit = this.component2;
        int i5 = i3 + 85;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return bongaMatrixUnit;
    }

    public final boolean isLoading() {
        int i = 2 % 2;
        int i2 = equals + 37;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean getHasError() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 21;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ShareDataUIState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = 77 % 2;
    }

    public RedeemBongaState() {
        this(null, null, null, null, false, false, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static RedeemBongaState copy$default(RedeemBongaState redeemBongaState, List list, String str, List list2, BongaMatrixUnit bongaMatrixUnit, boolean z, boolean z2, int i, Object obj) {
        List list3;
        BongaMatrixUnit bongaMatrixUnit2;
        boolean z3;
        int i2 = 2 % 2;
        int i3 = equals + 57;
        int i4 = i3 % 128;
        getAsAtTimestamp = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            list3 = redeemBongaState.component1;
            int i6 = i4 + 25;
            equals = i6 % 128;
            int i7 = i6 % 2;
        } else {
            list3 = list;
        }
        String str2 = (i & 2) != 0 ? redeemBongaState.copydefault : str;
        List list4 = (i & 4) != 0 ? redeemBongaState.component4 : list2;
        if ((i & 8) != 0) {
            int i8 = i4 + 33;
            equals = i8 % 128;
            if (i8 % 2 == 0) {
                bongaMatrixUnit2 = redeemBongaState.component2;
                int i9 = 29 / 0;
            } else {
                bongaMatrixUnit2 = redeemBongaState.component2;
            }
        } else {
            bongaMatrixUnit2 = bongaMatrixUnit;
        }
        if ((i & 16) != 0) {
            int i10 = i4 + 125;
            equals = i10 % 128;
            int i11 = i10 % 2;
            z3 = redeemBongaState.component3;
        } else {
            z3 = z;
        }
        return redeemBongaState.copy(list3, str2, list4, bongaMatrixUnit2, z3, (i & 32) != 0 ? redeemBongaState.ShareDataUIState : z2);
    }

    public final List<String> component1() {
        int i = 2 % 2;
        int i2 = equals + 39;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        List<String> list = this.component1;
        int i4 = i3 + 7;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = equals + 15;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 31;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<BongaMatrixUnit> component3() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 41;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        List<BongaMatrixUnit> list = this.component4;
        int i5 = i3 + 93;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final BongaMatrixUnit component4() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 121;
        equals = i3 % 128;
        int i4 = i3 % 2;
        BongaMatrixUnit bongaMatrixUnit = this.component2;
        int i5 = i2 + 85;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return bongaMatrixUnit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component5() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 113;
        equals = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.component3;
        int i5 = i2 + 101;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final boolean component6() {
        int i = 2 % 2;
        int i2 = equals + 51;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        boolean z = this.ShareDataUIState;
        int i5 = i3 + 27;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final RedeemBongaState copy(List<String> redeemTypeOptions, String selectedRedeemType, List<BongaMatrixUnit> unitOptions, BongaMatrixUnit selectedUnit, boolean isLoading, boolean hasError) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(redeemTypeOptions, "");
        Intrinsics.checkNotNullParameter(unitOptions, "");
        RedeemBongaState redeemBongaState = new RedeemBongaState(redeemTypeOptions, selectedRedeemType, unitOptions, selectedUnit, isLoading, hasError);
        int i2 = equals + 125;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        return redeemBongaState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof com.huawei.digitalpayment.consumer.sfcui.bonga.redeem.RedeemBongaState) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r6 = (com.huawei.digitalpayment.consumer.sfcui.bonga.redeem.RedeemBongaState) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.component1, r6.component1) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.bonga.redeem.RedeemBongaState.getAsAtTimestamp + 43;
        com.huawei.digitalpayment.consumer.sfcui.bonga.redeem.RedeemBongaState.equals = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.copydefault, r6.copydefault) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.bonga.redeem.RedeemBongaState.equals + 119;
        com.huawei.digitalpayment.consumer.sfcui.bonga.redeem.RedeemBongaState.getAsAtTimestamp = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if ((r6 % 2) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.component4, r6.component4) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.component2, r6.component2) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.bonga.redeem.RedeemBongaState.getAsAtTimestamp + 51;
        com.huawei.digitalpayment.consumer.sfcui.bonga.redeem.RedeemBongaState.equals = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006e, code lost:
    
        if (r5.component3 == r6.component3) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.bonga.redeem.RedeemBongaState.getAsAtTimestamp + 85;
        r1 = r6 % 128;
        com.huawei.digitalpayment.consumer.sfcui.bonga.redeem.RedeemBongaState.equals = r1;
        r6 = r6 % 2;
        r1 = r1 + 29;
        com.huawei.digitalpayment.consumer.sfcui.bonga.redeem.RedeemBongaState.getAsAtTimestamp = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0080, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0085, code lost:
    
        if (r5.ShareDataUIState == r6.ShareDataUIState) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0087, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.bonga.redeem.RedeemBongaState.getAsAtTimestamp;
        r1 = r6 + 71;
        com.huawei.digitalpayment.consumer.sfcui.bonga.redeem.RedeemBongaState.equals = r1 % 128;
        r1 = r1 % 2;
        r6 = r6 + 37;
        com.huawei.digitalpayment.consumer.sfcui.bonga.redeem.RedeemBongaState.equals = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0097, code lost:
    
        if ((r6 % 2) == 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0099, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009a, code lost:
    
        r6 = null;
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009f, code lost:
    
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
            int r1 = com.huawei.digitalpayment.consumer.sfcui.bonga.redeem.RedeemBongaState.equals
            int r1 = r1 + 77
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.bonga.redeem.RedeemBongaState.getAsAtTimestamp = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L16
            r1 = 16
            int r1 = r1 / r3
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r2
        L19:
            boolean r1 = r6 instanceof com.huawei.digitalpayment.consumer.sfcui.bonga.redeem.RedeemBongaState
            if (r1 != 0) goto L1e
            return r3
        L1e:
            com.huawei.digitalpayment.consumer.sfcui.bonga.redeem.RedeemBongaState r6 = (com.huawei.digitalpayment.consumer.sfcui.bonga.redeem.RedeemBongaState) r6
            java.util.List<java.lang.String> r1 = r5.component1
            java.util.List<java.lang.String> r4 = r6.component1
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L34
            int r6 = com.huawei.digitalpayment.consumer.sfcui.bonga.redeem.RedeemBongaState.getAsAtTimestamp
            int r6 = r6 + 43
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.bonga.redeem.RedeemBongaState.equals = r1
            int r6 = r6 % r0
            return r3
        L34:
            java.lang.String r1 = r5.copydefault
            java.lang.String r4 = r6.copydefault
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L4b
            int r6 = com.huawei.digitalpayment.consumer.sfcui.bonga.redeem.RedeemBongaState.equals
            int r6 = r6 + 119
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.bonga.redeem.RedeemBongaState.getAsAtTimestamp = r1
            int r6 = r6 % r0
            if (r6 == 0) goto L4a
            return r2
        L4a:
            return r3
        L4b:
            java.util.List<com.huawei.digitalpayment.consumer.sfcui.bonga.model.BongaMatrixUnit> r1 = r5.component4
            java.util.List<com.huawei.digitalpayment.consumer.sfcui.bonga.model.BongaMatrixUnit> r4 = r6.component4
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L56
            return r3
        L56:
            com.huawei.digitalpayment.consumer.sfcui.bonga.model.BongaMatrixUnit r1 = r5.component2
            com.huawei.digitalpayment.consumer.sfcui.bonga.model.BongaMatrixUnit r4 = r6.component2
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L6a
            int r6 = com.huawei.digitalpayment.consumer.sfcui.bonga.redeem.RedeemBongaState.getAsAtTimestamp
            int r6 = r6 + 51
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.bonga.redeem.RedeemBongaState.equals = r1
            int r6 = r6 % r0
            return r3
        L6a:
            boolean r1 = r5.component3
            boolean r4 = r6.component3
            if (r1 == r4) goto L81
            int r6 = com.huawei.digitalpayment.consumer.sfcui.bonga.redeem.RedeemBongaState.getAsAtTimestamp
            int r6 = r6 + 85
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.bonga.redeem.RedeemBongaState.equals = r1
            int r6 = r6 % r0
            int r1 = r1 + 29
            int r6 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.bonga.redeem.RedeemBongaState.getAsAtTimestamp = r6
            int r1 = r1 % r0
            return r3
        L81:
            boolean r1 = r5.ShareDataUIState
            boolean r6 = r6.ShareDataUIState
            if (r1 == r6) goto L9f
            int r6 = com.huawei.digitalpayment.consumer.sfcui.bonga.redeem.RedeemBongaState.getAsAtTimestamp
            int r1 = r6 + 71
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.bonga.redeem.RedeemBongaState.equals = r2
            int r1 = r1 % r0
            int r6 = r6 + 37
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.bonga.redeem.RedeemBongaState.equals = r1
            int r6 = r6 % r0
            if (r6 == 0) goto L9a
            return r3
        L9a:
            r6 = 0
            r6.hashCode()
            throw r6
        L9f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.bonga.redeem.RedeemBongaState.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.component1.hashCode();
        String str = this.copydefault;
        int iHashCode3 = 0;
        if (str == null) {
            int i2 = equals + 105;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iHashCode4 = this.component4.hashCode();
        BongaMatrixUnit bongaMatrixUnit = this.component2;
        if (bongaMatrixUnit != null) {
            iHashCode3 = bongaMatrixUnit.hashCode();
            int i4 = getAsAtTimestamp + 101;
            equals = i4 % 128;
            int i5 = i4 % 2;
        }
        int iHashCode5 = (((((((((iHashCode2 * 31) + iHashCode) * 31) + iHashCode4) * 31) + iHashCode3) * 31) + Boolean.hashCode(this.component3)) * 31) + Boolean.hashCode(this.ShareDataUIState);
        int i6 = equals + 125;
        getAsAtTimestamp = i6 % 128;
        int i7 = i6 % 2;
        return iHashCode5;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RedeemBongaState(redeemTypeOptions=" + this.component1 + ", selectedRedeemType=" + this.copydefault + ", unitOptions=" + this.component4 + ", selectedUnit=" + this.component2 + ", isLoading=" + this.component3 + ", hasError=" + this.ShareDataUIState + ")";
        int i2 = getAsAtTimestamp + 81;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
