package com.huawei.digitalpayment.home.viewmodel;

import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.huawei.digitalpayment.home.data.source.locaL.LocalFunctionGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/home/viewmodel/MyUiState;", "", GriverMonitorConstants.KEY_IS_LOADING, "", "isLogout", "myFunctions", "", "Lcom/huawei/digitalpayment/home/data/source/locaL/LocalFunctionGroup;", "<init>", "(ZZLjava/util/List;)V", "()Z", "getMyFunctions", "()Ljava/util/List;", "setMyFunctions", "(Ljava/util/List;)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MyUiState {
    private static int component1 = 0;
    private static int copydefault = 1;
    private final boolean ShareDataUIState;
    private List<LocalFunctionGroup> component2;
    private final boolean component3;

    public MyUiState(boolean z, boolean z2, List<LocalFunctionGroup> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.component3 = z;
        this.ShareDataUIState = z2;
        this.component2 = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MyUiState(boolean z, boolean z2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = copydefault + 15;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            z = false;
        }
        z2 = (i & 2) != 0 ? false : z2;
        if ((i & 4) != 0) {
            list = CollectionsKt.emptyList();
            int i5 = copydefault + 53;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        }
        this(z, z2, list);
    }

    public final boolean isLoading() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 121;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        boolean z = this.component3;
        int i4 = i2 + 61;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 65 / 0;
        }
        return z;
    }

    public final boolean isLogout() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 9;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.ShareDataUIState;
        int i5 = i2 + 93;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<LocalFunctionGroup> getMyFunctions() {
        int i = 2 % 2;
        int i2 = copydefault + 89;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        List<LocalFunctionGroup> list = this.component2;
        int i5 = i3 + 11;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final void setMyFunctions(List<LocalFunctionGroup> list) {
        int i = 2 % 2;
        int i2 = component1 + 19;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(list, "");
            this.component2 = list;
            throw null;
        }
        Intrinsics.checkNotNullParameter(list, "");
        this.component2 = list;
        int i3 = component1 + 1;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
    }

    public MyUiState() {
        this(false, false, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static MyUiState copy$default(MyUiState myUiState, boolean z, boolean z2, List list, int i, Object obj) {
        int i2 = 2 % 2;
        Object obj2 = null;
        if ((i & 1) != 0) {
            int i3 = component1 + 37;
            int i4 = i3 % 128;
            copydefault = i4;
            if (i3 % 2 == 0) {
                boolean z3 = myUiState.component3;
                obj2.hashCode();
                throw null;
            }
            z = myUiState.component3;
            int i5 = i4 + 65;
            component1 = i5 % 128;
            int i6 = i5 % 2;
        }
        if ((i & 2) != 0) {
            z2 = myUiState.ShareDataUIState;
        }
        if ((i & 4) != 0) {
            int i7 = copydefault + 45;
            int i8 = i7 % 128;
            component1 = i8;
            if (i7 % 2 != 0) {
                List<LocalFunctionGroup> list2 = myUiState.component2;
                obj2.hashCode();
                throw null;
            }
            list = myUiState.component2;
            int i9 = i8 + 55;
            copydefault = i9 % 128;
            int i10 = i9 % 2;
        }
        return myUiState.copy(z, z2, list);
    }

    public final boolean component1() {
        int i = 2 % 2;
        int i2 = component1 + 109;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        boolean z = this.component3;
        int i5 = i3 + 11;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 37 / 0;
        }
        return z;
    }

    public final boolean component2() {
        boolean z;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 83;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            z = this.ShareDataUIState;
            int i4 = 50 / 0;
        } else {
            z = this.ShareDataUIState;
        }
        int i5 = i2 + 65;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final List<LocalFunctionGroup> component3() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 89;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        List<LocalFunctionGroup> list = this.component2;
        int i5 = i2 + 43;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final MyUiState copy(boolean isLoading, boolean isLogout, List<LocalFunctionGroup> myFunctions) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(myFunctions, "");
        MyUiState myUiState = new MyUiState(isLoading, isLogout, myFunctions);
        int i2 = copydefault + 105;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return myUiState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof com.huawei.digitalpayment.home.viewmodel.MyUiState) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r1 = r1 + 15;
        com.huawei.digitalpayment.home.viewmodel.MyUiState.copydefault = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r6 = (com.huawei.digitalpayment.home.viewmodel.MyUiState) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r5.component3 == r6.component3) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r5.ShareDataUIState == r6.ShareDataUIState) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.component2, r6.component2) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
    
        r6 = com.huawei.digitalpayment.home.viewmodel.MyUiState.copydefault + 29;
        com.huawei.digitalpayment.home.viewmodel.MyUiState.component1 = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
    
        if ((r6 % 2) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
    
        r6 = null;
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        throw null;
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
            int r1 = com.huawei.digitalpayment.home.viewmodel.MyUiState.component1
            int r2 = r1 + 65
            int r3 = r2 % 128
            com.huawei.digitalpayment.home.viewmodel.MyUiState.copydefault = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L16
            r2 = 19
            int r2 = r2 / r4
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r3
        L19:
            boolean r2 = r6 instanceof com.huawei.digitalpayment.home.viewmodel.MyUiState
            if (r2 != 0) goto L25
            int r1 = r1 + 15
            int r6 = r1 % 128
            com.huawei.digitalpayment.home.viewmodel.MyUiState.copydefault = r6
            int r1 = r1 % r0
            return r4
        L25:
            com.huawei.digitalpayment.home.viewmodel.MyUiState r6 = (com.huawei.digitalpayment.home.viewmodel.MyUiState) r6
            boolean r1 = r5.component3
            boolean r2 = r6.component3
            if (r1 == r2) goto L2e
            return r4
        L2e:
            boolean r1 = r5.ShareDataUIState
            boolean r2 = r6.ShareDataUIState
            if (r1 == r2) goto L35
            return r4
        L35:
            java.util.List<com.huawei.digitalpayment.home.data.source.locaL.LocalFunctionGroup> r1 = r5.component2
            java.util.List<com.huawei.digitalpayment.home.data.source.locaL.LocalFunctionGroup> r6 = r6.component2
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)
            if (r6 != 0) goto L40
            return r4
        L40:
            int r6 = com.huawei.digitalpayment.home.viewmodel.MyUiState.copydefault
            int r6 = r6 + 29
            int r1 = r6 % 128
            com.huawei.digitalpayment.home.viewmodel.MyUiState.component1 = r1
            int r6 = r6 % r0
            if (r6 != 0) goto L4c
            return r3
        L4c:
            r6 = 0
            r6.hashCode()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.home.viewmodel.MyUiState.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 7;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((Boolean.hashCode(this.component3) * 31) + Boolean.hashCode(this.ShareDataUIState)) * 31) + this.component2.hashCode();
        int i4 = component1 + 17;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MyUiState(isLoading=" + this.component3 + ", isLogout=" + this.ShareDataUIState + ", myFunctions=" + this.component2 + ")";
        int i2 = component1 + 33;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
