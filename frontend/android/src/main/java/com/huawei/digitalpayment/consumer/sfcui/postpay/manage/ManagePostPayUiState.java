package com.huawei.digitalpayment.consumer.sfcui.postpay.manage;

import com.huawei.digitalpayment.consumer.base.resp.Balances;
import com.huawei.digitalpayment.consumer.sfcui.components.bundles.BundleMenu;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÇ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0016H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/postpay/manage/ManagePostPayUiState;", "", "balance", "Lcom/huawei/digitalpayment/consumer/base/resp/Balances;", "postPayMenu", "", "Lcom/huawei/digitalpayment/consumer/sfcui/components/bundles/BundleMenu;", "<init>", "(Lcom/huawei/digitalpayment/consumer/base/resp/Balances;Ljava/util/List;)V", "getBalance", "()Lcom/huawei/digitalpayment/consumer/base/resp/Balances;", "getPostPayMenu", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ManagePostPayUiState {
    public static final int $stable = 8;
    private static int component1 = 0;
    private static int component2 = 25 % 128;
    private static int component3 = 0;
    private static int copy = 1;
    private final List<BundleMenu> ShareDataUIState;
    private final Balances copydefault;

    public ManagePostPayUiState(Balances balances, List<BundleMenu> list) {
        Intrinsics.checkNotNullParameter(balances, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = balances;
        this.ShareDataUIState = list;
    }

    public final Balances getBalance() {
        int i = 2 % 2;
        int i2 = copy + 15;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Balances balances = this.copydefault;
        int i4 = i3 + 93;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            return balances;
        }
        throw null;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ManagePostPayUiState(com.huawei.digitalpayment.consumer.base.resp.Balances r21, java.util.List r22, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
        /*
            r20 = this;
            r0 = r23 & 1
            r1 = 2
            if (r0 == 0) goto L4d
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.CounterUnits r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.CounterUnits.KES
            java.lang.String r6 = r0.toString()
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.CounterUnits r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.CounterUnits.KES
            java.lang.String r11 = r0.toString()
            java.util.List r13 = kotlin.collections.CollectionsKt.emptyList()
            com.huawei.digitalpayment.consumer.base.resp.BalanceDetails r0 = new com.huawei.digitalpayment.consumer.base.resp.BalanceDetails
            java.lang.String r8 = "Credit Limit"
            java.lang.String r9 = "C_INITIAL_CREDIT_LIMIT"
            r10 = 0
            java.lang.String r12 = ""
            java.lang.String r14 = "active"
            r15 = 0
            r16 = 0
            r17 = 0
            java.lang.String r18 = ""
            r2 = 1
            java.lang.Boolean r19 = java.lang.Boolean.valueOf(r2)
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            java.util.List r8 = kotlin.collections.CollectionsKt.listOf(r0)
            com.huawei.digitalpayment.consumer.base.resp.Balances r0 = new com.huawei.digitalpayment.consumer.base.resp.Balances
            java.lang.String r3 = "A_CREDIT_LIMIT"
            java.lang.String r4 = "1"
            r5 = 0
            java.lang.String r7 = "ACTIVE"
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            int r2 = com.huawei.digitalpayment.consumer.sfcui.postpay.manage.ManagePostPayUiState.component1
            int r2 = r2 + 55
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.postpay.manage.ManagePostPayUiState.copy = r3
            int r2 = r2 % r1
            int r2 = r1 % r1
            goto L4f
        L4d:
            r0 = r21
        L4f:
            r2 = r23 & 2
            if (r2 == 0) goto L6e
            int r2 = com.huawei.digitalpayment.consumer.sfcui.postpay.manage.ManagePostPayUiState.component1
            int r2 = r2 + 23
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.postpay.manage.ManagePostPayUiState.copy = r3
            int r2 = r2 % r1
            if (r2 != 0) goto L67
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            r2 = 94
            int r2 = r2 / 0
            goto L6b
        L67:
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
        L6b:
            r2 = r20
            goto L72
        L6e:
            r2 = r20
            r1 = r22
        L72:
            r2.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.postpay.manage.ManagePostPayUiState.<init>(com.huawei.digitalpayment.consumer.base.resp.Balances, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final List<BundleMenu> getPostPayMenu() {
        int i = 2 % 2;
        int i2 = copy + 111;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        List<BundleMenu> list = this.ShareDataUIState;
        int i4 = i3 + 21;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    static {
        int i = 25 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ManagePostPayUiState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ManagePostPayUiState copy$default(ManagePostPayUiState managePostPayUiState, Balances balances, List list, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = copy + 73;
            int i4 = i3 % 128;
            component1 = i4;
            int i5 = i3 % 2;
            balances = managePostPayUiState.copydefault;
            int i6 = i4 + 85;
            copy = i6 % 128;
            int i7 = i6 % 2;
        }
        if ((i & 2) != 0) {
            int i8 = component1 + 59;
            copy = i8 % 128;
            int i9 = i8 % 2;
            list = managePostPayUiState.ShareDataUIState;
        }
        return managePostPayUiState.copy(balances, list);
    }

    public final Balances component1() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 75;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Balances balances = this.copydefault;
        int i4 = i2 + 67;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 46 / 0;
        }
        return balances;
    }

    public final List<BundleMenu> component2() {
        int i = 2 % 2;
        int i2 = component1 + 43;
        int i3 = i2 % 128;
        copy = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<BundleMenu> list = this.ShareDataUIState;
        int i4 = i3 + 85;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 87 / 0;
        }
        return list;
    }

    public final ManagePostPayUiState copy(Balances balance, List<BundleMenu> postPayMenu) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(balance, "");
        Intrinsics.checkNotNullParameter(postPayMenu, "");
        ManagePostPayUiState managePostPayUiState = new ManagePostPayUiState(balance, postPayMenu);
        int i2 = component1 + 83;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return managePostPayUiState;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof com.huawei.digitalpayment.consumer.sfcui.postpay.manage.ManagePostPayUiState) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r6 = (com.huawei.digitalpayment.consumer.sfcui.postpay.manage.ManagePostPayUiState) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5.copydefault, r6.copydefault)) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.ShareDataUIState, r6.ShareDataUIState) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.postpay.manage.ManagePostPayUiState.component1 + 65;
        com.huawei.digitalpayment.consumer.sfcui.postpay.manage.ManagePostPayUiState.copy = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        if ((r6 % 2) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
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
            int r1 = com.huawei.digitalpayment.consumer.sfcui.postpay.manage.ManagePostPayUiState.component1
            int r1 = r1 + 61
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.postpay.manage.ManagePostPayUiState.copy = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L16
            r1 = 93
            int r1 = r1 / r3
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r2
        L19:
            boolean r1 = r6 instanceof com.huawei.digitalpayment.consumer.sfcui.postpay.manage.ManagePostPayUiState
            if (r1 != 0) goto L1e
            return r3
        L1e:
            com.huawei.digitalpayment.consumer.sfcui.postpay.manage.ManagePostPayUiState r6 = (com.huawei.digitalpayment.consumer.sfcui.postpay.manage.ManagePostPayUiState) r6
            com.huawei.digitalpayment.consumer.base.resp.Balances r1 = r5.copydefault
            com.huawei.digitalpayment.consumer.base.resp.Balances r4 = r6.copydefault
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            r1 = r1 ^ r2
            if (r1 == 0) goto L2c
            return r3
        L2c:
            java.util.List<com.huawei.digitalpayment.consumer.sfcui.components.bundles.BundleMenu> r1 = r5.ShareDataUIState
            java.util.List<com.huawei.digitalpayment.consumer.sfcui.components.bundles.BundleMenu> r6 = r6.ShareDataUIState
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)
            if (r6 != 0) goto L43
            int r6 = com.huawei.digitalpayment.consumer.sfcui.postpay.manage.ManagePostPayUiState.component1
            int r6 = r6 + 65
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.postpay.manage.ManagePostPayUiState.copy = r1
            int r6 = r6 % r0
            if (r6 != 0) goto L42
            return r2
        L42:
            return r3
        L43:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.postpay.manage.ManagePostPayUiState.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 7;
        copy = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.copydefault.hashCode() * 31) + this.ShareDataUIState.hashCode();
        int i4 = copy + 37;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ManagePostPayUiState(balance=" + this.copydefault + ", postPayMenu=" + this.ShareDataUIState + ")";
        int i2 = copy + 85;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 99 / 0;
        }
        return str;
    }
}
